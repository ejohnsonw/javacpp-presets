// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.parquet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.parquet.*;


@Namespace("parquet") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.parquet.class)
public class WriterProperties extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public WriterProperties(Pointer p) { super(p); }

  @NoOffset public static class Builder extends Pointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Builder(Pointer p) { super(p); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Builder(long size) { super((Pointer)null); allocateArray(size); }
      private native void allocateArray(long size);
      @Override public Builder position(long position) {
          return (Builder)super.position(position);
      }
  
    public Builder() { super((Pointer)null); allocate(); }
    private native void allocate();

    public native Builder memory_pool(MemoryPool pool);

    public native Builder enable_dictionary();

    public native Builder disable_dictionary();

    public native Builder enable_dictionary(@StdString String path);
    public native Builder enable_dictionary(@StdString BytePointer path);

    public native Builder enable_dictionary(@SharedPtr ColumnPath path);

    public native Builder disable_dictionary(@StdString String path);
    public native Builder disable_dictionary(@StdString BytePointer path);

    public native Builder disable_dictionary(@SharedPtr ColumnPath path);

    public native Builder dictionary_pagesize_limit(@Cast("int64_t") long dictionary_psize_limit);

    public native Builder write_batch_size(@Cast("int64_t") long write_batch_size);

    public native Builder max_row_group_length(@Cast("int64_t") long max_row_group_length);

    public native Builder data_pagesize(@Cast("int64_t") long pg_size);

    public native Builder version(ParquetVersion.type version);
    public native Builder version(@Cast("parquet::ParquetVersion::type") int version);

    public native Builder created_by(@StdString String created_by);
    public native Builder created_by(@StdString BytePointer created_by);

    /**
     * Define the encoding that is used when we don't utilise dictionary encoding.
     *
     * This either apply if dictionary encoding is disabled or if we fallback
     * as the dictionary grew too large.
     */
    public native Builder encoding(Encoding.type encoding_type);
    public native Builder encoding(@Cast("parquet::Encoding::type") int encoding_type);

    /**
     * Define the encoding that is used when we don't utilise dictionary encoding.
     *
     * This either apply if dictionary encoding is disabled or if we fallback
     * as the dictionary grew too large.
     */
    public native Builder encoding(@StdString String path, Encoding.type encoding_type);
    public native Builder encoding(@StdString BytePointer path, @Cast("parquet::Encoding::type") int encoding_type);

    /**
     * Define the encoding that is used when we don't utilise dictionary encoding.
     *
     * This either apply if dictionary encoding is disabled or if we fallback
     * as the dictionary grew too large.
     */
    public native Builder encoding(@SharedPtr ColumnPath path,
                          Encoding.type encoding_type);
    public native Builder encoding(@SharedPtr ColumnPath path,
                          @Cast("parquet::Encoding::type") int encoding_type);

    public native Builder compression(Compression.type codec);
    public native Builder compression(@Cast("arrow::Compression::type") int codec);

    public native Builder max_statistics_size(@Cast("size_t") long max_stats_sz);

    public native Builder compression(@StdString String path, Compression.type codec);
    public native Builder compression(@StdString BytePointer path, @Cast("arrow::Compression::type") int codec);

    
    ///
    public native Builder compression(@SharedPtr ColumnPath path,
                             Compression.type codec);
    public native Builder compression(@SharedPtr ColumnPath path,
                             @Cast("arrow::Compression::type") int codec);

    /** \brief Specify the default compression level for the compressor in
     *  every column.  In case a column does not have an explicitly specified
     *  compression level, the default one would be used.
     * 
     *  The provided compression level is compressor specific. The user would
     *  have to familiarize oneself with the available levels for the selected
     *  compressor.  If the compressor does not allow for selecting different
     *  compression levels, calling this function would not have any effect.
     *  Parquet and Arrow do not validate the passed compression level.  If no
     *  level is selected by the user or if the special
     *  std::numeric_limits<int>::min() value is passed, then Arrow selects the
     *  compression level. */
    
    ///
    public native Builder compression_level(int compression_level);

    /** \brief Specify a compression level for the compressor for the column
     *  described by path.
     * 
     *  The provided compression level is compressor specific. The user would
     *  have to familiarize oneself with the available levels for the selected
     *  compressor.  If the compressor does not allow for selecting different
     *  compression levels, calling this function would not have any effect.
     *  Parquet and Arrow do not validate the passed compression level.  If no
     *  level is selected by the user or if the special
     *  std::numeric_limits<int>::min() value is passed, then Arrow selects the
     *  compression level. */
    
    ///
    public native Builder compression_level(@StdString String path, int compression_level);
    public native Builder compression_level(@StdString BytePointer path, int compression_level);

    /** \brief Specify a compression level for the compressor for the column
     *  described by path.
     * 
     *  The provided compression level is compressor specific. The user would
     *  have to familiarize oneself with the available levels for the selected
     *  compressor.  If the compressor does not allow for selecting different
     *  compression levels, calling this function would not have any effect.
     *  Parquet and Arrow do not validate the passed compression level.  If no
     *  level is selected by the user or if the special
     *  std::numeric_limits<int>::min() value is passed, then Arrow selects the
     *  compression level. */
    public native Builder compression_level(@SharedPtr ColumnPath path,
                                   int compression_level);

    public native Builder enable_statistics();

    public native Builder disable_statistics();

    public native Builder enable_statistics(@StdString String path);
    public native Builder enable_statistics(@StdString BytePointer path);

    public native Builder enable_statistics(@SharedPtr ColumnPath path);

    public native Builder disable_statistics(@StdString String path);
    public native Builder disable_statistics(@StdString BytePointer path);

    public native Builder disable_statistics(@SharedPtr ColumnPath path);

    public native @SharedPtr WriterProperties build();
  }

  public native MemoryPool memory_pool();

  public native @Cast("int64_t") long dictionary_pagesize_limit();

  public native @Cast("int64_t") long write_batch_size();

  public native @Cast("int64_t") long max_row_group_length();

  public native @Cast("int64_t") long data_pagesize();

  public native ParquetVersion.type version();

  public native @StdString String created_by();

  public native Encoding.type dictionary_index_encoding();

  public native Encoding.type dictionary_page_encoding();

  public native @Const @ByRef ColumnProperties column_properties(
        @SharedPtr ColumnPath path);

  public native Encoding.type encoding(@SharedPtr ColumnPath path);

  public native Compression.type compression(@SharedPtr ColumnPath path);

  public native int compression_level(@SharedPtr ColumnPath path);

  public native @Cast("bool") boolean dictionary_enabled(@SharedPtr ColumnPath path);

  public native @Cast("bool") boolean statistics_enabled(@SharedPtr ColumnPath path);

  public native @Cast("size_t") long max_statistics_size(@SharedPtr ColumnPath path);
}