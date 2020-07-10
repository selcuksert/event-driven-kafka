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
public class CartItem extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5034749648718880448L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CartItem\",\"namespace\":\"com.corp.concepts.shop.models\",\"fields\":[{\"name\":\"item\",\"type\":{\"type\":\"record\",\"name\":\"Item\",\"fields\":[{\"name\":\"id\",\"type\":\"long\"},{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"title\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"category\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"price\",\"type\":\"double\"},{\"name\":\"description\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"image\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"largeimage\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"features\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}}]}},{\"name\":\"quantity\",\"type\":\"int\"},{\"name\":\"size\",\"type\":{\"type\":\"enum\",\"name\":\"Size\",\"symbols\":[\"XS\",\"S\",\"M\",\"L\",\"XL\"]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<CartItem> ENCODER =
      new BinaryMessageEncoder<CartItem>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<CartItem> DECODER =
      new BinaryMessageDecoder<CartItem>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<CartItem> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<CartItem> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<CartItem> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<CartItem>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this CartItem to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a CartItem from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a CartItem instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static CartItem fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private com.corp.concepts.shop.models.Item item;
   private int quantity;
   private com.corp.concepts.shop.models.Size size;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CartItem() {}

  /**
   * All-args constructor.
   * @param item The new value for item
   * @param quantity The new value for quantity
   * @param size The new value for size
   */
  public CartItem(com.corp.concepts.shop.models.Item item, java.lang.Integer quantity, com.corp.concepts.shop.models.Size size) {
    this.item = item;
    this.quantity = quantity;
    this.size = size;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return item;
    case 1: return quantity;
    case 2: return size;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: item = (com.corp.concepts.shop.models.Item)value$; break;
    case 1: quantity = (java.lang.Integer)value$; break;
    case 2: size = (com.corp.concepts.shop.models.Size)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'item' field.
   * @return The value of the 'item' field.
   */
  public com.corp.concepts.shop.models.Item getItem() {
    return item;
  }


  /**
   * Sets the value of the 'item' field.
   * @param value the value to set.
   */
  public void setItem(com.corp.concepts.shop.models.Item value) {
    this.item = value;
  }

  /**
   * Gets the value of the 'quantity' field.
   * @return The value of the 'quantity' field.
   */
  public int getQuantity() {
    return quantity;
  }


  /**
   * Sets the value of the 'quantity' field.
   * @param value the value to set.
   */
  public void setQuantity(int value) {
    this.quantity = value;
  }

  /**
   * Gets the value of the 'size' field.
   * @return The value of the 'size' field.
   */
  public com.corp.concepts.shop.models.Size getSize() {
    return size;
  }


  /**
   * Sets the value of the 'size' field.
   * @param value the value to set.
   */
  public void setSize(com.corp.concepts.shop.models.Size value) {
    this.size = value;
  }

  /**
   * Creates a new CartItem RecordBuilder.
   * @return A new CartItem RecordBuilder
   */
  public static com.corp.concepts.shop.models.CartItem.Builder newBuilder() {
    return new com.corp.concepts.shop.models.CartItem.Builder();
  }

  /**
   * Creates a new CartItem RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CartItem RecordBuilder
   */
  public static com.corp.concepts.shop.models.CartItem.Builder newBuilder(com.corp.concepts.shop.models.CartItem.Builder other) {
    if (other == null) {
      return new com.corp.concepts.shop.models.CartItem.Builder();
    } else {
      return new com.corp.concepts.shop.models.CartItem.Builder(other);
    }
  }

  /**
   * Creates a new CartItem RecordBuilder by copying an existing CartItem instance.
   * @param other The existing instance to copy.
   * @return A new CartItem RecordBuilder
   */
  public static com.corp.concepts.shop.models.CartItem.Builder newBuilder(com.corp.concepts.shop.models.CartItem other) {
    if (other == null) {
      return new com.corp.concepts.shop.models.CartItem.Builder();
    } else {
      return new com.corp.concepts.shop.models.CartItem.Builder(other);
    }
  }

  /**
   * RecordBuilder for CartItem instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CartItem>
    implements org.apache.avro.data.RecordBuilder<CartItem> {

    private com.corp.concepts.shop.models.Item item;
    private com.corp.concepts.shop.models.Item.Builder itemBuilder;
    private int quantity;
    private com.corp.concepts.shop.models.Size size;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.corp.concepts.shop.models.CartItem.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.item)) {
        this.item = data().deepCopy(fields()[0].schema(), other.item);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (other.hasItemBuilder()) {
        this.itemBuilder = com.corp.concepts.shop.models.Item.newBuilder(other.getItemBuilder());
      }
      if (isValidValue(fields()[1], other.quantity)) {
        this.quantity = data().deepCopy(fields()[1].schema(), other.quantity);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.size)) {
        this.size = data().deepCopy(fields()[2].schema(), other.size);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing CartItem instance
     * @param other The existing instance to copy.
     */
    private Builder(com.corp.concepts.shop.models.CartItem other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.item)) {
        this.item = data().deepCopy(fields()[0].schema(), other.item);
        fieldSetFlags()[0] = true;
      }
      this.itemBuilder = null;
      if (isValidValue(fields()[1], other.quantity)) {
        this.quantity = data().deepCopy(fields()[1].schema(), other.quantity);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.size)) {
        this.size = data().deepCopy(fields()[2].schema(), other.size);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'item' field.
      * @return The value.
      */
    public com.corp.concepts.shop.models.Item getItem() {
      return item;
    }


    /**
      * Sets the value of the 'item' field.
      * @param value The value of 'item'.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.CartItem.Builder setItem(com.corp.concepts.shop.models.Item value) {
      validate(fields()[0], value);
      this.itemBuilder = null;
      this.item = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'item' field has been set.
      * @return True if the 'item' field has been set, false otherwise.
      */
    public boolean hasItem() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'item' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.corp.concepts.shop.models.Item.Builder getItemBuilder() {
      if (itemBuilder == null) {
        if (hasItem()) {
          setItemBuilder(com.corp.concepts.shop.models.Item.newBuilder(item));
        } else {
          setItemBuilder(com.corp.concepts.shop.models.Item.newBuilder());
        }
      }
      return itemBuilder;
    }

    /**
     * Sets the Builder instance for the 'item' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.corp.concepts.shop.models.CartItem.Builder setItemBuilder(com.corp.concepts.shop.models.Item.Builder value) {
      clearItem();
      itemBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'item' field has an active Builder instance
     * @return True if the 'item' field has an active Builder instance
     */
    public boolean hasItemBuilder() {
      return itemBuilder != null;
    }

    /**
      * Clears the value of the 'item' field.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.CartItem.Builder clearItem() {
      item = null;
      itemBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'quantity' field.
      * @return The value.
      */
    public int getQuantity() {
      return quantity;
    }


    /**
      * Sets the value of the 'quantity' field.
      * @param value The value of 'quantity'.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.CartItem.Builder setQuantity(int value) {
      validate(fields()[1], value);
      this.quantity = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'quantity' field has been set.
      * @return True if the 'quantity' field has been set, false otherwise.
      */
    public boolean hasQuantity() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'quantity' field.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.CartItem.Builder clearQuantity() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'size' field.
      * @return The value.
      */
    public com.corp.concepts.shop.models.Size getSize() {
      return size;
    }


    /**
      * Sets the value of the 'size' field.
      * @param value The value of 'size'.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.CartItem.Builder setSize(com.corp.concepts.shop.models.Size value) {
      validate(fields()[2], value);
      this.size = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'size' field has been set.
      * @return True if the 'size' field has been set, false otherwise.
      */
    public boolean hasSize() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'size' field.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.CartItem.Builder clearSize() {
      size = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public CartItem build() {
      try {
        CartItem record = new CartItem();
        if (itemBuilder != null) {
          try {
            record.item = this.itemBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("item"));
            throw e;
          }
        } else {
          record.item = fieldSetFlags()[0] ? this.item : (com.corp.concepts.shop.models.Item) defaultValue(fields()[0]);
        }
        record.quantity = fieldSetFlags()[1] ? this.quantity : (java.lang.Integer) defaultValue(fields()[1]);
        record.size = fieldSetFlags()[2] ? this.size : (com.corp.concepts.shop.models.Size) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<CartItem>
    WRITER$ = (org.apache.avro.io.DatumWriter<CartItem>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<CartItem>
    READER$ = (org.apache.avro.io.DatumReader<CartItem>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    this.item.customEncode(out);

    out.writeInt(this.quantity);

    out.writeEnum(this.size.ordinal());

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (this.item == null) {
        this.item = new com.corp.concepts.shop.models.Item();
      }
      this.item.customDecode(in);

      this.quantity = in.readInt();

      this.size = com.corp.concepts.shop.models.Size.values()[in.readEnum()];

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (this.item == null) {
            this.item = new com.corp.concepts.shop.models.Item();
          }
          this.item.customDecode(in);
          break;

        case 1:
          this.quantity = in.readInt();
          break;

        case 2:
          this.size = com.corp.concepts.shop.models.Size.values()[in.readEnum()];
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










