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
public class ItemDb extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2947543904165579426L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ItemDb\",\"namespace\":\"com.corp.concepts.shop.models\",\"fields\":[{\"name\":\"id\",\"type\":\"long\"},{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"title\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"category\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"price\",\"type\":\"double\"},{\"name\":\"description\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"image\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"largeImage\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"features\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ItemDb> ENCODER =
      new BinaryMessageEncoder<ItemDb>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ItemDb> DECODER =
      new BinaryMessageDecoder<ItemDb>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<ItemDb> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<ItemDb> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<ItemDb> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ItemDb>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this ItemDb to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a ItemDb from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a ItemDb instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static ItemDb fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private long id;
   private java.lang.String name;
   private java.lang.String title;
   private java.lang.String category;
   private double price;
   private java.lang.String description;
   private java.lang.String image;
   private java.lang.String largeImage;
   private java.lang.String features;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ItemDb() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param name The new value for name
   * @param title The new value for title
   * @param category The new value for category
   * @param price The new value for price
   * @param description The new value for description
   * @param image The new value for image
   * @param largeImage The new value for largeImage
   * @param features The new value for features
   */
  public ItemDb(java.lang.Long id, java.lang.String name, java.lang.String title, java.lang.String category, java.lang.Double price, java.lang.String description, java.lang.String image, java.lang.String largeImage, java.lang.String features) {
    this.id = id;
    this.name = name;
    this.title = title;
    this.category = category;
    this.price = price;
    this.description = description;
    this.image = image;
    this.largeImage = largeImage;
    this.features = features;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return title;
    case 3: return category;
    case 4: return price;
    case 5: return description;
    case 6: return image;
    case 7: return largeImage;
    case 8: return features;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Long)value$; break;
    case 1: name = value$ != null ? value$.toString() : null; break;
    case 2: title = value$ != null ? value$.toString() : null; break;
    case 3: category = value$ != null ? value$.toString() : null; break;
    case 4: price = (java.lang.Double)value$; break;
    case 5: description = value$ != null ? value$.toString() : null; break;
    case 6: image = value$ != null ? value$.toString() : null; break;
    case 7: largeImage = value$ != null ? value$.toString() : null; break;
    case 8: features = value$ != null ? value$.toString() : null; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
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
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.String getName() {
    return name;
  }


  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.String value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'title' field.
   * @return The value of the 'title' field.
   */
  public java.lang.String getTitle() {
    return title;
  }


  /**
   * Sets the value of the 'title' field.
   * @param value the value to set.
   */
  public void setTitle(java.lang.String value) {
    this.title = value;
  }

  /**
   * Gets the value of the 'category' field.
   * @return The value of the 'category' field.
   */
  public java.lang.String getCategory() {
    return category;
  }


  /**
   * Sets the value of the 'category' field.
   * @param value the value to set.
   */
  public void setCategory(java.lang.String value) {
    this.category = value;
  }

  /**
   * Gets the value of the 'price' field.
   * @return The value of the 'price' field.
   */
  public double getPrice() {
    return price;
  }


  /**
   * Sets the value of the 'price' field.
   * @param value the value to set.
   */
  public void setPrice(double value) {
    this.price = value;
  }

  /**
   * Gets the value of the 'description' field.
   * @return The value of the 'description' field.
   */
  public java.lang.String getDescription() {
    return description;
  }


  /**
   * Sets the value of the 'description' field.
   * @param value the value to set.
   */
  public void setDescription(java.lang.String value) {
    this.description = value;
  }

  /**
   * Gets the value of the 'image' field.
   * @return The value of the 'image' field.
   */
  public java.lang.String getImage() {
    return image;
  }


  /**
   * Sets the value of the 'image' field.
   * @param value the value to set.
   */
  public void setImage(java.lang.String value) {
    this.image = value;
  }

  /**
   * Gets the value of the 'largeImage' field.
   * @return The value of the 'largeImage' field.
   */
  public java.lang.String getLargeImage() {
    return largeImage;
  }


  /**
   * Sets the value of the 'largeImage' field.
   * @param value the value to set.
   */
  public void setLargeImage(java.lang.String value) {
    this.largeImage = value;
  }

  /**
   * Gets the value of the 'features' field.
   * @return The value of the 'features' field.
   */
  public java.lang.String getFeatures() {
    return features;
  }


  /**
   * Sets the value of the 'features' field.
   * @param value the value to set.
   */
  public void setFeatures(java.lang.String value) {
    this.features = value;
  }

  /**
   * Creates a new ItemDb RecordBuilder.
   * @return A new ItemDb RecordBuilder
   */
  public static com.corp.concepts.shop.models.ItemDb.Builder newBuilder() {
    return new com.corp.concepts.shop.models.ItemDb.Builder();
  }

  /**
   * Creates a new ItemDb RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ItemDb RecordBuilder
   */
  public static com.corp.concepts.shop.models.ItemDb.Builder newBuilder(com.corp.concepts.shop.models.ItemDb.Builder other) {
    if (other == null) {
      return new com.corp.concepts.shop.models.ItemDb.Builder();
    } else {
      return new com.corp.concepts.shop.models.ItemDb.Builder(other);
    }
  }

  /**
   * Creates a new ItemDb RecordBuilder by copying an existing ItemDb instance.
   * @param other The existing instance to copy.
   * @return A new ItemDb RecordBuilder
   */
  public static com.corp.concepts.shop.models.ItemDb.Builder newBuilder(com.corp.concepts.shop.models.ItemDb other) {
    if (other == null) {
      return new com.corp.concepts.shop.models.ItemDb.Builder();
    } else {
      return new com.corp.concepts.shop.models.ItemDb.Builder(other);
    }
  }

  /**
   * RecordBuilder for ItemDb instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ItemDb>
    implements org.apache.avro.data.RecordBuilder<ItemDb> {

    private long id;
    private java.lang.String name;
    private java.lang.String title;
    private java.lang.String category;
    private double price;
    private java.lang.String description;
    private java.lang.String image;
    private java.lang.String largeImage;
    private java.lang.String features;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.corp.concepts.shop.models.ItemDb.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.title)) {
        this.title = data().deepCopy(fields()[2].schema(), other.title);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.category)) {
        this.category = data().deepCopy(fields()[3].schema(), other.category);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.price)) {
        this.price = data().deepCopy(fields()[4].schema(), other.price);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.description)) {
        this.description = data().deepCopy(fields()[5].schema(), other.description);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.image)) {
        this.image = data().deepCopy(fields()[6].schema(), other.image);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (isValidValue(fields()[7], other.largeImage)) {
        this.largeImage = data().deepCopy(fields()[7].schema(), other.largeImage);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
      if (isValidValue(fields()[8], other.features)) {
        this.features = data().deepCopy(fields()[8].schema(), other.features);
        fieldSetFlags()[8] = other.fieldSetFlags()[8];
      }
    }

    /**
     * Creates a Builder by copying an existing ItemDb instance
     * @param other The existing instance to copy.
     */
    private Builder(com.corp.concepts.shop.models.ItemDb other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.title)) {
        this.title = data().deepCopy(fields()[2].schema(), other.title);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.category)) {
        this.category = data().deepCopy(fields()[3].schema(), other.category);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.price)) {
        this.price = data().deepCopy(fields()[4].schema(), other.price);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.description)) {
        this.description = data().deepCopy(fields()[5].schema(), other.description);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.image)) {
        this.image = data().deepCopy(fields()[6].schema(), other.image);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.largeImage)) {
        this.largeImage = data().deepCopy(fields()[7].schema(), other.largeImage);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.features)) {
        this.features = data().deepCopy(fields()[8].schema(), other.features);
        fieldSetFlags()[8] = true;
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
    public com.corp.concepts.shop.models.ItemDb.Builder setId(long value) {
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
    public com.corp.concepts.shop.models.ItemDb.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.String getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.ItemDb.Builder setName(java.lang.String value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.ItemDb.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'title' field.
      * @return The value.
      */
    public java.lang.String getTitle() {
      return title;
    }


    /**
      * Sets the value of the 'title' field.
      * @param value The value of 'title'.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.ItemDb.Builder setTitle(java.lang.String value) {
      validate(fields()[2], value);
      this.title = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'title' field has been set.
      * @return True if the 'title' field has been set, false otherwise.
      */
    public boolean hasTitle() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'title' field.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.ItemDb.Builder clearTitle() {
      title = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'category' field.
      * @return The value.
      */
    public java.lang.String getCategory() {
      return category;
    }


    /**
      * Sets the value of the 'category' field.
      * @param value The value of 'category'.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.ItemDb.Builder setCategory(java.lang.String value) {
      validate(fields()[3], value);
      this.category = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'category' field has been set.
      * @return True if the 'category' field has been set, false otherwise.
      */
    public boolean hasCategory() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'category' field.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.ItemDb.Builder clearCategory() {
      category = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'price' field.
      * @return The value.
      */
    public double getPrice() {
      return price;
    }


    /**
      * Sets the value of the 'price' field.
      * @param value The value of 'price'.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.ItemDb.Builder setPrice(double value) {
      validate(fields()[4], value);
      this.price = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'price' field has been set.
      * @return True if the 'price' field has been set, false otherwise.
      */
    public boolean hasPrice() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'price' field.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.ItemDb.Builder clearPrice() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'description' field.
      * @return The value.
      */
    public java.lang.String getDescription() {
      return description;
    }


    /**
      * Sets the value of the 'description' field.
      * @param value The value of 'description'.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.ItemDb.Builder setDescription(java.lang.String value) {
      validate(fields()[5], value);
      this.description = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'description' field has been set.
      * @return True if the 'description' field has been set, false otherwise.
      */
    public boolean hasDescription() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'description' field.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.ItemDb.Builder clearDescription() {
      description = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'image' field.
      * @return The value.
      */
    public java.lang.String getImage() {
      return image;
    }


    /**
      * Sets the value of the 'image' field.
      * @param value The value of 'image'.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.ItemDb.Builder setImage(java.lang.String value) {
      validate(fields()[6], value);
      this.image = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'image' field has been set.
      * @return True if the 'image' field has been set, false otherwise.
      */
    public boolean hasImage() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'image' field.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.ItemDb.Builder clearImage() {
      image = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'largeImage' field.
      * @return The value.
      */
    public java.lang.String getLargeImage() {
      return largeImage;
    }


    /**
      * Sets the value of the 'largeImage' field.
      * @param value The value of 'largeImage'.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.ItemDb.Builder setLargeImage(java.lang.String value) {
      validate(fields()[7], value);
      this.largeImage = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'largeImage' field has been set.
      * @return True if the 'largeImage' field has been set, false otherwise.
      */
    public boolean hasLargeImage() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'largeImage' field.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.ItemDb.Builder clearLargeImage() {
      largeImage = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'features' field.
      * @return The value.
      */
    public java.lang.String getFeatures() {
      return features;
    }


    /**
      * Sets the value of the 'features' field.
      * @param value The value of 'features'.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.ItemDb.Builder setFeatures(java.lang.String value) {
      validate(fields()[8], value);
      this.features = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'features' field has been set.
      * @return True if the 'features' field has been set, false otherwise.
      */
    public boolean hasFeatures() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'features' field.
      * @return This builder.
      */
    public com.corp.concepts.shop.models.ItemDb.Builder clearFeatures() {
      features = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ItemDb build() {
      try {
        ItemDb record = new ItemDb();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Long) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.String) defaultValue(fields()[1]);
        record.title = fieldSetFlags()[2] ? this.title : (java.lang.String) defaultValue(fields()[2]);
        record.category = fieldSetFlags()[3] ? this.category : (java.lang.String) defaultValue(fields()[3]);
        record.price = fieldSetFlags()[4] ? this.price : (java.lang.Double) defaultValue(fields()[4]);
        record.description = fieldSetFlags()[5] ? this.description : (java.lang.String) defaultValue(fields()[5]);
        record.image = fieldSetFlags()[6] ? this.image : (java.lang.String) defaultValue(fields()[6]);
        record.largeImage = fieldSetFlags()[7] ? this.largeImage : (java.lang.String) defaultValue(fields()[7]);
        record.features = fieldSetFlags()[8] ? this.features : (java.lang.String) defaultValue(fields()[8]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ItemDb>
    WRITER$ = (org.apache.avro.io.DatumWriter<ItemDb>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ItemDb>
    READER$ = (org.apache.avro.io.DatumReader<ItemDb>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeLong(this.id);

    out.writeString(this.name);

    out.writeString(this.title);

    out.writeString(this.category);

    out.writeDouble(this.price);

    out.writeString(this.description);

    out.writeString(this.image);

    out.writeString(this.largeImage);

    out.writeString(this.features);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.id = in.readLong();

      this.name = in.readString();

      this.title = in.readString();

      this.category = in.readString();

      this.price = in.readDouble();

      this.description = in.readString();

      this.image = in.readString();

      this.largeImage = in.readString();

      this.features = in.readString();

    } else {
      for (int i = 0; i < 9; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.id = in.readLong();
          break;

        case 1:
          this.name = in.readString();
          break;

        case 2:
          this.title = in.readString();
          break;

        case 3:
          this.category = in.readString();
          break;

        case 4:
          this.price = in.readDouble();
          break;

        case 5:
          this.description = in.readString();
          break;

        case 6:
          this.image = in.readString();
          break;

        case 7:
          this.largeImage = in.readString();
          break;

        case 8:
          this.features = in.readString();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










