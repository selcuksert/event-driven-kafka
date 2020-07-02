/**
 * @license
 * Copyright (c) 2018 The Polymer Project Authors. All rights reserved.
 * This code may only be used under the BSD style license found at http://polymer.github.io/LICENSE.txt
 * The complete set of authors may be found at http://polymer.github.io/AUTHORS.txt
 * The complete set of contributors may be found at http://polymer.github.io/CONTRIBUTORS.txt
 * Code distributed by Google as part of the polymer project is also
 * subject to an additional IP rights grant found at http://polymer.github.io/PATENTS.txt
 */

import { setCart, getEntryId } from './actions/cart.js';
import { SERVICES } from './actions/app.js';

/**
 * Converts Kafka event data schema for 
 * cart module to UI data schema
 * @param {Array} items Server response
 */
function convertToUIData(items) {
  let uiCartData = new Object();

  if (items && items.cartItems) {
    let cartItemData = items.cartItems;

    cartItemData.forEach(cartItem => {
      var itemId = getEntryId(cartItem);
      uiCartData[itemId] = {
        item: cartItem.item,
        quantity: cartItem.quantity,
        size: cartItem.size
      }
    }
    );

    return uiCartData;
  }
}

export function installCart(store) {

  getCartData();

  store.subscribe(() => {
    const state = store.getState();
    sendAddCartRequest(state.cart);
  });

  function getCartData() {
    fetch(`${window.location.protocol}//${window.location.hostname}:${SERVICES.cart.reader.port}/${SERVICES.cart.reader.path}?customerId=1`)
      .then(res => res.json())
      .then(items => store.dispatch(setCart(convertToUIData(items))))
      .catch(() => { });
  }

  function sendAddCartRequest(cart) {
    if (undefined === cart) {
      return;
    }

    let cartValues = Object.values(cart);

    let cartItemList = new Array();

    cartValues.forEach(cartItem => {
      cartItemList.push({
        item: cartItem.item,
        quantity: cartItem.quantity,
        size: cartItem.size
      })
    });

    let addCartRequestBody = {
      customerId: 1,
      cartItems: cartItemList
    }

    fetch(`${window.location.protocol}//${window.location.hostname}:${SERVICES.cart.writer.port}/${SERVICES.cart.writer.path}`, {
      method: 'POST',
      body: JSON.stringify(addCartRequestBody),
      headers: {
        'Content-Type': 'application/json',
        'Accept': 'application/json'
      }
    });
  }
}
