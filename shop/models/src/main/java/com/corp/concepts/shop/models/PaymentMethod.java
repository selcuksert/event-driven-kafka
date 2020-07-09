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
public class PaymentMethod extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7229144124580911494L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PaymentMethod\",\"namespace\":\"com.corp.concepts.shop.models\",\"fields\":[{\"name\":\"cardHolderName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"cardNumber\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"expiry\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"cvv\",\"type\":\"int\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<PaymentMethod> ENCODER =
      new BinaryMessageEncoder<PaymentMethod>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<PaymentMethod> DECODER =
      new BinaryMessageDecoder<PaymentMethod>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<PaymentMethod> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<PaymentMethod> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<PaymentMethod> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<PaymentMethod>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this PaymentMethod to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a PaymentMethod from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a PaymentMethod instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static PaymentMethod fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.String cardHolderName;
   private java.lang.String cardNumber;
   private java.lang.String expiry;
   private int cvv;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public PaymentMethod() {}

  /**
   * All-args constructor.
   * @param cardHolderName The new value for cardHolderName
   * @param cardNumber The new value for cardNumber
   * @param expiry The new value for expiry
   * @param cvv The new value for cvv
   */
  public PaymentMethod(java.lang.String cardHolderName, java.lang.String cardNumber, java.lang.String expiry, java.lang.Integer cvv) {
    this.cardHolderName = cardHolderName;
    this.cardNumber = cardNumber;
    this.expiry = expiry;
    this.cvv = cvv;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return cardHolderName;
    case 1: return cardNumber;
    case 2: return expiry;
    case 3: return cvv;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: cardHolderName = value$ != null ? value$.toString() : null; break;
    case 1: cardNumber = value$ != null ? value$.toString() : null; break;
    case 2: expiry = value$ != null ? value$.toString() : null; break;
    case 3: cvv = (java.lang.Integer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'cardHolderName' field.
   * @return The value of the 'cardHolderName' field.
   */
  public java.lang.String getCardHolderName() {
    return cardHolderName;
  }


  /**
   * Sets the value of the 'cardHolderName' field.
   * @param value the value to set.
   */
  public void setCardHolderName(java.lang.String value) {
    this.cardHolderName = value;
  }

  /**
   * Gets the value of the 'cardNumber' field.
   * @return The value of the 'cardNumber' field.
   */
  public java.lang.String getCardNumber() {
    return cardNumber;
  }


  /**
   * Sets the value of the 'cardNumber' field.
   * @param value the value to set.
   */
  public void setCardNumber(java.lang.String value) {
    this.cardNumber = value;
  }

  /**
   * Gets the value of the 'expiry' field.
   * @return The value of the 'expiry' field.
   */
  public java.lang.String getExpiry() {
    return expiry;
  }


  /**
   * Sets the value of the 'expiry' field.
   * @param value the value to set.
   */
  public void setExpiry(java.lang.String value) {
    this.expiry = value;
  }

  /**
   * Gets the value of the 'cvv' field.
   * @return The value of the 'cvv' field.
   */
  public int getCvv() {
    return cvv;
  }


  /**
   * Sets the value of the 'cvv' field.
   * @param value the value to set.
   */
  public void setCvv(int value) {
    this.cvv = value;
  }

  /**
   * Creates a new PaymentMethod RecordBuilder.
   * @return A new PaymentMethod RecordBuilder
   */
  public static com.corp.concepts.shop.models.PaymentMethod.Builder newBuilder() {
    return new com.corp.concepts.shop.models.PaymentMethod.Builder();
  }

  /**
   * Creates a new PaymentMethod RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new PaymentMethod RecordBuilder
   */
  public static com.corp.concepts.shop.models.PaymentMethod.Builder newBuilder(com.corp.concepts.shop.models.PaymentMethod.Builder other) {
    if (other == null) {
      return new com.corp.concepts.shop.models.PaymentMethod.Builder();
    } else {
      return new com.corp.concepts.shop.models.PaymentMethod.Builder(other);
    }
  }

  /**
   * Creates a new PaymentMethod RecordBuilder by copying an existing PaymentMethod instance.
   * @param other The existing instance to copy.
   * @return A new PaymentMethod RecordBuilder
   */
  public static com.corp.concepts.shop.models.PaymentMethod.Builder newBuilder(com.corp.concepts.shop.models.PaymentMethod other) {
    if (other == null) {
      return new com.corp.concepts.shop.models.PaymentMethod.Builder();
    } else {
      return new com.corp.concepts.shop.models.PaymentMethod.Builder(other);
    }
  }

  /**
   * RecordBuilder for PaymentMethod instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PaymentMethod>
    implements org.apache.avro.data.RecordBuilder<PaymentMethod> {

    private java.lang.String cardHolderName;
    private java.lang.String cardNumber;
    private java.lang.String expiry;
    private int cvv;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.corp.concepts.shop.models.PaymentMethod.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.cardHolderName)) {
        this.cardHolderName = data().deepCopy(fields()[0].schema(), other.cardHolderName);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.cardNumber)) {
        this.cardNumber = data().deepCopy(fields()[1].schema(), other.cardNumber);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.expiry)) {
        this.expiry = data().deepCopy(fields()[2].schema(), other.expiry);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.cvv)) {
        this.cvv = data().deepCopy(fields()[3].schema(), other.cvv);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing PaymentMethod instance
     * @param other The existing instance to copy.
     */
    private Builder(com.corp.concepts.shop.models.PaymentMethod other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.cardHolderName)) {
        this.cardHolderName = data().deepCopy(fields()[0].schema(), other.cardHolderName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.cardNumber)) {
        this.cardNumber = data().deepCopy(fields()[1].schema(), other.cardNumber);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.expiry)) {
        this.expiry = data().deepCopy(fields()[2].schema(), other.expiry);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.cvv)) {
        this.cvv = data().deepCopy(fields()[3].schema(), other.cvv);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'cardHolderName' field.
      * @return The value.
      */
    public java.lang.String getCardHolderName() {
      return cardHolderName;
    }


    /**
      * Sets the value of the 'cardHolderName' field.
      * @param value The value of 'cardHolderName'.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.PaymentMethod.Builder setCardHolderName(java.lang.String value) {
      validate(fields()[0], value);
      this.cardHolderName = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'cardHolderName' field has been set.
      * @return True if the 'cardHolderName' field has been set, false otherwise.
      */
    public boolean hasCardHolderName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'cardHolderName' field.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.PaymentMethod.Builder clearCardHolderName() {
      cardHolderName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'cardNumber' field.
      * @return The value.
      */
    public java.lang.String getCardNumber() {
      return cardNumber;
    }


    /**
      * Sets the value of the 'cardNumber' field.
      * @param value The value of 'cardNumber'.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.PaymentMethod.Builder setCardNumber(java.lang.String value) {
      validate(fields()[1], value);
      this.cardNumber = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'cardNumber' field has been set.
      * @return True if the 'cardNumber' field has been set, false otherwise.
      */
    public boolean hasCardNumber() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'cardNumber' field.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.PaymentMethod.Builder clearCardNumber() {
      cardNumber = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'expiry' field.
      * @return The value.
      */
    public java.lang.String getExpiry() {
      return expiry;
    }


    /**
      * Sets the value of the 'expiry' field.
      * @param value The value of 'expiry'.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.PaymentMethod.Builder setExpiry(java.lang.String value) {
      validate(fields()[2], value);
      this.expiry = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'expiry' field has been set.
      * @return True if the 'expiry' field has been set, false otherwise.
      */
    public boolean hasExpiry() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'expiry' field.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.PaymentMethod.Builder clearExpiry() {
      expiry = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'cvv' field.
      * @return The value.
      */
    public int getCvv() {
      return cvv;
    }


    /**
      * Sets the value of the 'cvv' field.
      * @param value The value of 'cvv'.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.PaymentMethod.Builder setCvv(int value) {
      validate(fields()[3], value);
      this.cvv = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'cvv' field has been set.
      * @return True if the 'cvv' field has been set, false otherwise.
      */
    public boolean hasCvv() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'cvv' field.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.PaymentMethod.Builder clearCvv() {
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public PaymentMethod build() {
      try {
        PaymentMethod record = new PaymentMethod();
        record.cardHolderName = fieldSetFlags()[0] ? this.cardHolderName : (java.lang.String) defaultValue(fields()[0]);
        record.cardNumber = fieldSetFlags()[1] ? this.cardNumber : (java.lang.String) defaultValue(fields()[1]);
        record.expiry = fieldSetFlags()[2] ? this.expiry : (java.lang.String) defaultValue(fields()[2]);
        record.cvv = fieldSetFlags()[3] ? this.cvv : (java.lang.Integer) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<PaymentMethod>
    WRITER$ = (org.apache.avro.io.DatumWriter<PaymentMethod>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<PaymentMethod>
    READER$ = (org.apache.avro.io.DatumReader<PaymentMethod>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.cardHolderName);

    out.writeString(this.cardNumber);

    out.writeString(this.expiry);

    out.writeInt(this.cvv);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.cardHolderName = in.readString();

      this.cardNumber = in.readString();

      this.expiry = in.readString();

      this.cvv = in.readInt();

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.cardHolderName = in.readString();
          break;

        case 1:
          this.cardNumber = in.readString();
          break;

        case 2:
          this.expiry = in.readString();
          break;

        case 3:
          this.cvv = in.readInt();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










