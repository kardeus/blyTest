package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new twin.jin.ably.DataBinderMapperImpl());
  }
}
