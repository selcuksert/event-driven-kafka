/**
 * @license
 * Copyright (c) 2018 The Polymer Project Authors. All rights reserved.
 * This code may only be used under the BSD style license found at http://polymer.github.io/LICENSE.txt
 * The complete set of authors may be found at http://polymer.github.io/AUTHORS.txt
 * The complete set of contributors may be found at http://polymer.github.io/CONTRIBUTORS.txt
 * Code distributed by Google as part of the polymer project is also
 * subject to an additional IP rights grant found at http://polymer.github.io/PATENTS.txt
 */

import { setCart } from './actions/cart.js';

const CART_LOCAL_STORAGE_KEY = 'shop-cart-data';

function getCartData() {
  const localCartData = localStorage.getItem(CART_LOCAL_STORAGE_KEY);

  return fetch(`${window.location.protocol}//${window.location.hostname}:9005/cart?customerId=1`)
      .then(res => res.json())
      .then(items => JSON.stringify(items))
      .catch(() => {});
}

export function installCart(store) {
  function handleStorageEvent(event) {
    // Note: In IE11 the storage event fires even when the modification is in the same window.
    // So here we check to make sure the window receving the event is inactive.
    if (event == null || document.hidden) {
      store.dispatch(setCart(getCartData()));
    }
  }
  window.addEventListener('storage', handleStorageEvent);
  handleStorageEvent();

  store.subscribe(() => {
    const state = store.getState();
    sendAddCartRequest(state.cart);
  });

  function sendAddCartRequest(cart) {
    if(undefined === cart) {
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

    console.log(addCartRequestBody);

    fetch(`${window.location.protocol}//${window.location.hostname}:9004/cart`, {
      method: 'POST',
      body: JSON.stringify(addCartRequestBody),
      headers: {
        'Content-Type': 'application/json',
        'Accept': 'application/json'
      }
    });
  }
}
