/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.corp.concepts.shop.models;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Order extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 6690438648933688682L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Order\",\"namespace\":\"com.corp.concepts.shop.models\",\"fields\":[{\"name\":\"id\",\"type\":\"long\"},{\"name\":\"accountId\",\"type\":\"long\"},{\"name\":\"timestamp\",\"type\":\"int\"},{\"name\":\"state\",\"type\":{\"type\":\"enum\",\"name\":\"OrderState\",\"symbols\":[\"CREATED\",\"VALIDATED\",\"FAILED\",\"SHIPPED\"]}},{\"name\":\"paymentMethod\",\"type\":{\"type\":\"record\",\"name\":\"PaymentMethod\",\"fields\":[{\"name\":\"cardHolderName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"cardNumber\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"expiry\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"cvv\",\"type\":\"int\"}]}},{\"name\":\"shippingAddressId\",\"type\":\"long\"},{\"name\":\"billingAddressId\",\"type\":\"long\"},{\"name\":\"cartId\",\"type\":\"long\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Order> ENCODER =
      new BinaryMessageEncoder<Order>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Order> DECODER =
      new BinaryMessageDecoder<Order>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Order> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Order> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Order> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Order>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Order to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Order from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Order instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Order fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private long id;
   private long accountId;
   private int timestamp;
   private com.corp.concepts.shop.models.OrderState state;
   private com.corp.concepts.shop.models.PaymentMethod paymentMethod;
   private long shippingAddressId;
   private long billingAddressId;
   private long cartId;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Order() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param accountId The new value for accountId
   * @param timestamp The new value for timestamp
   * @param state The new value for state
   * @param paymentMethod The new value for paymentMethod
   * @param shippingAddressId The new value for shippingAddressId
   * @param billingAddressId The new value for billingAddressId
   * @param cartId The new value for cartId
   */
  public Order(java.lang.Long id, java.lang.Long accountId, java.lang.Integer timestamp, com.corp.concepts.shop.models.OrderState state, com.corp.concepts.shop.models.PaymentMethod paymentMethod, java.lang.Long shippingAddressId, java.lang.Long billingAddressId, java.lang.Long cartId) {
    this.id = id;
    this.accountId = accountId;
    this.timestamp = timestamp;
    this.state = state;
    this.paymentMethod = paymentMethod;
    this.shippingAddressId = shippingAddressId;
    this.billingAddressId = billingAddressId;
    this.cartId = cartId;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return accountId;
    case 2: return timestamp;
    case 3: return state;
    case 4: return paymentMethod;
    case 5: return shippingAddressId;
    case 6: return billingAddressId;
    case 7: return cartId;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Long)value$; break;
    case 1: accountId = (java.lang.Long)value$; break;
    case 2: timestamp = (java.lang.Integer)value$; break;
    case 3: state = (com.corp.concepts.shop.models.OrderState)value$; break;
    case 4: paymentMethod = (com.corp.concepts.shop.models.PaymentMethod)value$; break;
    case 5: shippingAddressId = (java.lang.Long)value$; break;
    case 6: billingAddressId = (java.lang.Long)value$; break;
    case 7: cartId = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public long getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(long value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'accountId' field.
   * @return The value of the 'accountId' field.
   */
  public long getAccountId() {
    return accountId;
  }


  /**
   * Sets the value of the 'accountId' field.
   * @param value the value to set.
   */
  public void setAccountId(long value) {
    this.accountId = value;
  }

  /**
   * Gets the value of the 'timestamp' field.
   * @return The value of the 'timestamp' field.
   */
  public int getTimestamp() {
    return timestamp;
  }


  /**
   * Sets the value of the 'timestamp' field.
   * @param value the value to set.
   */
  public void setTimestamp(int value) {
    this.timestamp = value;
  }

  /**
   * Gets the value of the 'state' field.
   * @return The value of the 'state' field.
   */
  public com.corp.concepts.shop.models.OrderState getState() {
    return state;
  }


  /**
   * Sets the value of the 'state' field.
   * @param value the value to set.
   */
  public void setState(com.corp.concepts.shop.models.OrderState value) {
    this.state = value;
  }

  /**
   * Gets the value of the 'paymentMethod' field.
   * @return The value of the 'paymentMethod' field.
   */
  public com.corp.concepts.shop.models.PaymentMethod getPaymentMethod() {
    return paymentMethod;
  }


  /**
   * Sets the value of the 'paymentMethod' field.
   * @param value the value to set.
   */
  public void setPaymentMethod(com.corp.concepts.shop.models.PaymentMethod value) {
    this.paymentMethod = value;
  }

  /**
   * Gets the value of the 'shippingAddressId' field.
   * @return The value of the 'shippingAddressId' field.
   */
  public long getShippingAddressId() {
    return shippingAddressId;
  }


  /**
   * Sets the value of the 'shippingAddressId' field.
   * @param value the value to set.
   */
  public void setShippingAddressId(long value) {
    this.shippingAddressId = value;
  }

  /**
   * Gets the value of the 'billingAddressId' field.
   * @return The value of the 'billingAddressId' field.
   */
  public long getBillingAddressId() {
    return billingAddressId;
  }


  /**
   * Sets the value of the 'billingAddressId' field.
   * @param value the value to set.
   */
  public void setBillingAddressId(long value) {
    this.billingAddressId = value;
  }

  /**
   * Gets the value of the 'cartId' field.
   * @return The value of the 'cartId' field.
   */
  public long getCartId() {
    return cartId;
  }


  /**
   * Sets the value of the 'cartId' field.
   * @param value the value to set.
   */
  public void setCartId(long value) {
    this.cartId = value;
  }

  /**
   * Creates a new Order RecordBuilder.
   * @return A new Order RecordBuilder
   */
  public static com.corp.concepts.shop.models.Order.Builder newBuilder() {
    return new com.corp.concepts.shop.models.Order.Builder();
  }

  /**
   * Creates a new Order RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Order RecordBuilder
   */
  public static com.corp.concepts.shop.models.Order.Builder newBuilder(com.corp.concepts.shop.models.Order.Builder other) {
    if (other == null) {
      return new com.corp.concepts.shop.models.Order.Builder();
    } else {
      return new com.corp.concepts.shop.models.Order.Builder(other);
    }
  }

  /**
   * Creates a new Order RecordBuilder by copying an existing Order instance.
   * @param other The existing instance to copy.
   * @return A new Order RecordBuilder
   */
  public static com.corp.concepts.shop.models.Order.Builder newBuilder(com.corp.concepts.shop.models.Order other) {
    if (other == null) {
      return new com.corp.concepts.shop.models.Order.Builder();
    } else {
      return new com.corp.concepts.shop.models.Order.Builder(other);
    }
  }

  /**
   * RecordBuilder for Order instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Order>
    implements org.apache.avro.data.RecordBuilder<Order> {

    private long id;
    private long accountId;
    private int timestamp;
    private com.corp.concepts.shop.models.OrderState state;
    private com.corp.concepts.shop.models.PaymentMethod paymentMethod;
    private com.corp.concepts.shop.models.PaymentMethod.Builder paymentMethodBuilder;
    private long shippingAddressId;
    private long billingAddressId;
    private long cartId;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.corp.concepts.shop.models.Order.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.accountId)) {
        this.accountId = data().deepCopy(fields()[1].schema(), other.accountId);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[2].schema(), other.timestamp);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.state)) {
        this.state = data().deepCopy(fields()[3].schema(), other.state);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.paymentMethod)) {
        this.paymentMethod = data().deepCopy(fields()[4].schema(), other.paymentMethod);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (other.hasPaymentMethodBuilder()) {
        this.paymentMethodBuilder = com.corp.concepts.shop.models.PaymentMethod.newBuilder(other.getPaymentMethodBuilder());
      }
      if (isValidValue(fields()[5], other.shippingAddressId)) {
        this.shippingAddressId = data().deepCopy(fields()[5].schema(), other.shippingAddressId);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.billingAddressId)) {
        this.billingAddressId = data().deepCopy(fields()[6].schema(), other.billingAddressId);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (isValidValue(fields()[7], other.cartId)) {
        this.cartId = data().deepCopy(fields()[7].schema(), other.cartId);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
    }

    /**
     * Creates a Builder by copying an existing Order instance
     * @param other The existing instance to copy.
     */
    private Builder(com.corp.concepts.shop.models.Order other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.accountId)) {
        this.accountId = data().deepCopy(fields()[1].schema(), other.accountId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[2].schema(), other.timestamp);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.state)) {
        this.state = data().deepCopy(fields()[3].schema(), other.state);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.paymentMethod)) {
        this.paymentMethod = data().deepCopy(fields()[4].schema(), other.paymentMethod);
        fieldSetFlags()[4] = true;
      }
      this.paymentMethodBuilder = null;
      if (isValidValue(fields()[5], other.shippingAddressId)) {
        this.shippingAddressId = data().deepCopy(fields()[5].schema(), other.shippingAddressId);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.billingAddressId)) {
        this.billingAddressId = data().deepCopy(fields()[6].schema(), other.billingAddressId);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.cartId)) {
        this.cartId = data().deepCopy(fields()[7].schema(), other.cartId);
        fieldSetFlags()[7] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public long getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.Order.Builder setId(long value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.Order.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'accountId' field.
      * @return The value.
      */
    public long getAccountId() {
      return accountId;
    }


    /**
      * Sets the value of the 'accountId' field.
      * @param value The value of 'accountId'.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.Order.Builder setAccountId(long value) {
      validate(fields()[1], value);
      this.accountId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'accountId' field has been set.
      * @return True if the 'accountId' field has been set, false otherwise.
      */
    public boolean hasAccountId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'accountId' field.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.Order.Builder clearAccountId() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'timestamp' field.
      * @return The value.
      */
    public int getTimestamp() {
      return timestamp;
    }


    /**
      * Sets the value of the 'timestamp' field.
      * @param value The value of 'timestamp'.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.Order.Builder setTimestamp(int value) {
      validate(fields()[2], value);
      this.timestamp = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'timestamp' field has been set.
      * @return True if the 'timestamp' field has been set, false otherwise.
      */
    public boolean hasTimestamp() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'timestamp' field.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.Order.Builder clearTimestamp() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'state' field.
      * @return The value.
      */
    public com.corp.concepts.shop.models.OrderState getState() {
      return state;
    }


    /**
      * Sets the value of the 'state' field.
      * @param value The value of 'state'.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.Order.Builder setState(com.corp.concepts.shop.models.OrderState value) {
      validate(fields()[3], value);
      this.state = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'state' field has been set.
      * @return True if the 'state' field has been set, false otherwise.
      */
    public boolean hasState() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'state' field.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.Order.Builder clearState() {
      state = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'paymentMethod' field.
      * @return The value.
      */
    public com.corp.concepts.shop.models.PaymentMethod getPaymentMethod() {
      return paymentMethod;
    }


    /**
      * Sets the value of the 'paymentMethod' field.
      * @param value The value of 'paymentMethod'.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.Order.Builder setPaymentMethod(com.corp.concepts.shop.models.PaymentMethod value) {
      validate(fields()[4], value);
      this.paymentMethodBuilder = null;
      this.paymentMethod = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'paymentMethod' field has been set.
      * @return True if the 'paymentMethod' field has been set, false otherwise.
      */
    public boolean hasPaymentMethod() {
      return fieldSetFlags()[4];
    }

    /**
     * Gets the Builder instance for the 'paymentMethod' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.corp.concepts.shop.models.PaymentMethod.Builder getPaymentMethodBuilder() {
      if (paymentMethodBuilder == null) {
        if (hasPaymentMethod()) {
          setPaymentMethodBuilder(com.corp.concepts.shop.models.PaymentMethod.newBuilder(paymentMethod));
        } else {
          setPaymentMethodBuilder(com.corp.concepts.shop.models.PaymentMethod.newBuilder());
        }
      }
      return paymentMethodBuilder;
    }

    /**
     * Sets the Builder instance for the 'paymentMethod' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.corp.concepts.shop.models.Order.Builder setPaymentMethodBuilder(com.corp.concepts.shop.models.PaymentMethod.Builder value) {
      clearPaymentMethod();
      paymentMethodBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'paymentMethod' field has an active Builder instance
     * @return True if the 'paymentMethod' field has an active Builder instance
     */
    public boolean hasPaymentMethodBuilder() {
      return paymentMethodBuilder != null;
    }

    /**
      * Clears the value of the 'paymentMethod' field.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.Order.Builder clearPaymentMethod() {
      paymentMethod = null;
      paymentMethodBuilder = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'shippingAddressId' field.
      * @return The value.
      */
    public long getShippingAddressId() {
      return shippingAddressId;
    }


    /**
      * Sets the value of the 'shippingAddressId' field.
      * @param value The value of 'shippingAddressId'.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.Order.Builder setShippingAddressId(long value) {
      validate(fields()[5], value);
      this.shippingAddressId = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'shippingAddressId' field has been set.
      * @return True if the 'shippingAddressId' field has been set, false otherwise.
      */
    public boolean hasShippingAddressId() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'shippingAddressId' field.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.Order.Builder clearShippingAddressId() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'billingAddressId' field.
      * @return The value.
      */
    public long getBillingAddressId() {
      return billingAddressId;
    }


    /**
      * Sets the value of the 'billingAddressId' field.
      * @param value The value of 'billingAddressId'.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.Order.Builder setBillingAddressId(long value) {
      validate(fields()[6], value);
      this.billingAddressId = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'billingAddressId' field has been set.
      * @return True if the 'billingAddressId' field has been set, false otherwise.
      */
    public boolean hasBillingAddressId() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'billingAddressId' field.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.Order.Builder clearBillingAddressId() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'cartId' field.
      * @return The value.
      */
    public long getCartId() {
      return cartId;
    }


    /**
      * Sets the value of the 'cartId' field.
      * @param value The value of 'cartId'.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.Order.Builder setCartId(long value) {
      validate(fields()[7], value);
      this.cartId = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'cartId' field has been set.
      * @return True if the 'cartId' field has been set, false otherwise.
      */
    public boolean hasCartId() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'cartId' field.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.Order.Builder clearCartId() {
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Order build() {
      try {
        Order record = new Order();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Long) defaultValue(fields()[0]);
        record.accountId = fieldSetFlags()[1] ? this.accountId : (java.lang.Long) defaultValue(fields()[1]);
        record.timestamp = fieldSetFlags()[2] ? this.timestamp : (java.lang.Integer) defaultValue(fields()[2]);
        record.state = fieldSetFlags()[3] ? this.state : (com.corp.concepts.shop.models.OrderState) defaultValue(fields()[3]);
        if (paymentMethodBuilder != null) {
          try {
            record.paymentMethod = this.paymentMethodBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("paymentMethod"));
            throw e;
          }
        } else {
          record.paymentMethod = fieldSetFlags()[4] ? this.paymentMethod : (com.corp.concepts.shop.models.PaymentMethod) defaultValue(fields()[4]);
        }
        record.shippingAddressId = fieldSetFlags()[5] ? this.shippingAddressId : (java.lang.Long) defaultValue(fields()[5]);
        record.billingAddressId = fieldSetFlags()[6] ? this.billingAddressId : (java.lang.Long) defaultValue(fields()[6]);
        record.cartId = fieldSetFlags()[7] ? this.cartId : (java.lang.Long) defaultValue(fields()[7]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Order>
    WRITER$ = (org.apache.avro.io.DatumWriter<Order>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Order>
    READER$ = (org.apache.avro.io.DatumReader<Order>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeLong(this.id);

    out.writeLong(this.accountId);

    out.writeInt(this.timestamp);

    out.writeEnum(this.state.ordinal());

    this.paymentMethod.customEncode(out);

    out.writeLong(this.shippingAddressId);

    out.writeLong(this.billingAddressId);

    out.writeLong(this.cartId);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.id = in.readLong();

      this.accountId = in.readLong();

      this.timestamp = in.readInt();

      this.state = com.corp.concepts.shop.models.OrderState.values()[in.readEnum()];

      if (this.paymentMethod == null) {
        this.paymentMethod = new com.corp.concepts.shop.models.PaymentMethod();
      }
      this.paymentMethod.customDecode(in);

      this.shippingAddressId = in.readLong();

      this.billingAddressId = in.readLong();

      this.cartId = in.readLong();

    } else {
      for (int i = 0; i < 8; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.id = in.readLong();
          break;

        case 1:
          this.accountId = in.readLong();
          break;

        case 2:
          this.timestamp = in.readInt();
          break;

        case 3:
          this.state = com.corp.concepts.shop.models.OrderState.values()[in.readEnum()];
          break;

        case 4:
          if (this.paymentMethod == null) {
            this.paymentMethod = new com.corp.concepts.shop.models.PaymentMethod();
          }
          this.paymentMethod.customDecode(in);
          break;

        case 5:
          this.shippingAddressId = in.readLong();
          break;

        case 6:
          this.billingAddressId = in.readLong();
          break;

        case 7:
          this.cartId = in.readLong();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









