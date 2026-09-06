package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import okhttp3.HttpUrl;

@JacksonStdImpl
/* loaded from: classes2.dex */
public class MapSerializer extends ContainerSerializer<Map<?, ?>> implements ContextualSerializer {
    protected static final JavaType UNSPECIFIED_TYPE = TypeFactory.unknownType();
    protected PropertySerializerMap _dynamicValueSerializers;
    protected final Object _filterId;
    protected final Set<String> _ignoredEntries;
    protected JsonSerializer<Object> _keySerializer;
    protected final JavaType _keyType;
    protected final BeanProperty _property;
    protected final boolean _sortKeys;
    protected final Object _suppressableValue;
    protected JsonSerializer<Object> _valueSerializer;
    protected final JavaType _valueType;
    protected final boolean _valueTypeIsStatic;
    protected final TypeSerializer _valueTypeSerializer;

    protected MapSerializer(Set<String> set, JavaType javaType, JavaType javaType2, boolean z, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, JsonSerializer<?> jsonSerializer2) {
        super(Map.class, false);
        this._ignoredEntries = (set == null || set.isEmpty()) ? null : set;
        this._keyType = javaType;
        this._valueType = javaType2;
        this._valueTypeIsStatic = z;
        this._valueTypeSerializer = typeSerializer;
        this._keySerializer = jsonSerializer;
        this._valueSerializer = jsonSerializer2;
        this._dynamicValueSerializers = PropertySerializerMap.emptyForProperties();
        this._property = null;
        this._filterId = null;
        this._sortKeys = false;
        this._suppressableValue = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.fasterxml.jackson.databind.ser.std.MapSerializer construct(java.util.Set<java.lang.String> r9, com.fasterxml.jackson.databind.JavaType r10, boolean r11, com.fasterxml.jackson.databind.jsontype.TypeSerializer r12, com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r13, com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r14, java.lang.Object r15) {
        /*
            if (r10 != 0) goto L7
            com.fasterxml.jackson.databind.JavaType r10 = com.fasterxml.jackson.databind.ser.std.MapSerializer.UNSPECIFIED_TYPE
            r3 = r10
            r4 = r3
            goto L11
        L7:
            com.fasterxml.jackson.databind.JavaType r0 = r10.getKeyType()
            com.fasterxml.jackson.databind.JavaType r10 = r10.getContentType()
            r4 = r10
            r3 = r0
        L11:
            r10 = 0
            if (r11 != 0) goto L21
            if (r4 == 0) goto L1f
            boolean r11 = r4.isFinal()
            if (r11 == 0) goto L1f
            r10 = 1
            r11 = 1
            goto L2b
        L1f:
            r11 = 0
            goto L2b
        L21:
            java.lang.Class r0 = r4.getRawClass()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 != r1) goto L2b
            r5 = 0
            goto L2c
        L2b:
            r5 = r11
        L2c:
            com.fasterxml.jackson.databind.ser.std.MapSerializer r10 = new com.fasterxml.jackson.databind.ser.std.MapSerializer
            r1 = r10
            r2 = r9
            r6 = r12
            r7 = r13
            r8 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            if (r15 == 0) goto L3c
            com.fasterxml.jackson.databind.ser.std.MapSerializer r10 = r10.withFilterId(r15)
        L3c:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.MapSerializer.construct(java.util.Set, com.fasterxml.jackson.databind.JavaType, boolean, com.fasterxml.jackson.databind.jsontype.TypeSerializer, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object):com.fasterxml.jackson.databind.ser.std.MapSerializer");
    }

    protected void _ensureOverride() {
        if (MapSerializer.class == MapSerializer.class) {
            return;
        }
        throw new IllegalStateException("Missing override in class " + MapSerializer.class.getName());
    }

    protected final JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap propertySerializerMap, Class<?> cls, SerializerProvider serializerProvider) throws JsonMappingException {
        PropertySerializerMap.SerializerAndMapResult findAndAddSecondarySerializer = propertySerializerMap.findAndAddSecondarySerializer(cls, serializerProvider, this._property);
        PropertySerializerMap propertySerializerMap2 = findAndAddSecondarySerializer.map;
        if (propertySerializerMap != propertySerializerMap2) {
            this._dynamicValueSerializers = propertySerializerMap2;
        }
        return findAndAddSecondarySerializer.serializer;
    }

    protected Map<?, ?> _orderEntries(Map<?, ?> map, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, Object obj) throws IOException {
        if (map instanceof SortedMap) {
            return map;
        }
        if (!map.containsKey(null)) {
            return new TreeMap(map);
        }
        TreeMap treeMap = new TreeMap();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key == null) {
                _writeNullKeyedEntry(jsonGenerator, serializerProvider, obj, entry.getValue());
            } else {
                treeMap.put(key, entry.getValue());
            }
        }
        return treeMap;
    }

    protected void _writeNullKeyedEntry(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, Object obj, Object obj2) throws IOException {
        JsonSerializer<Object> jsonSerializer;
        JsonSerializer<Object> findNullKeySerializer = serializerProvider.findNullKeySerializer(this._keyType, this._property);
        if (obj2 != null) {
            JsonSerializer<Object> jsonSerializer2 = this._valueSerializer;
            if (jsonSerializer2 == null) {
                Class<?> cls = obj2.getClass();
                JsonSerializer<Object> serializerFor = this._dynamicValueSerializers.serializerFor(cls);
                jsonSerializer2 = serializerFor == null ? this._valueType.hasGenericTypes() ? _findAndAddDynamic(this._dynamicValueSerializers, serializerProvider.constructSpecializedType(this._valueType, cls), serializerProvider) : _findAndAddDynamic(this._dynamicValueSerializers, cls, serializerProvider) : serializerFor;
            }
            if (obj == JsonInclude.Include.NON_EMPTY && jsonSerializer2.isEmpty(serializerProvider, obj2)) {
                return;
            } else {
                jsonSerializer = jsonSerializer2;
            }
        } else if (obj != null) {
            return;
        } else {
            jsonSerializer = serializerProvider.getDefaultNullValueSerializer();
        }
        try {
            findNullKeySerializer.serialize(null, jsonGenerator, serializerProvider);
            jsonSerializer.serialize(obj2, jsonGenerator, serializerProvider);
        } catch (Exception e2) {
            wrapAndThrow(serializerProvider, e2, obj2, HttpUrl.FRAGMENT_ENCODE_SET);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer<?> jsonSerializer;
        AnnotatedMember member;
        Object findFilterId;
        Boolean feature;
        Set<String> findIgnoredForSerialization;
        AnnotationIntrospector annotationIntrospector = serializerProvider.getAnnotationIntrospector();
        JsonSerializer<Object> jsonSerializer2 = null;
        AnnotatedMember member2 = beanProperty == null ? null : beanProperty.getMember();
        Object obj = this._suppressableValue;
        if (member2 == null || annotationIntrospector == null) {
            jsonSerializer = null;
        } else {
            Object findKeySerializer = annotationIntrospector.findKeySerializer(member2);
            jsonSerializer = findKeySerializer != null ? serializerProvider.serializerInstance(member2, findKeySerializer) : null;
            Object findContentSerializer = annotationIntrospector.findContentSerializer(member2);
            if (findContentSerializer != null) {
                jsonSerializer2 = serializerProvider.serializerInstance(member2, findContentSerializer);
            }
        }
        JsonInclude.Include contentInclusion = findIncludeOverrides(serializerProvider, beanProperty, Map.class).getContentInclusion();
        if (contentInclusion != null && contentInclusion != JsonInclude.Include.USE_DEFAULTS) {
            obj = contentInclusion;
        }
        if (jsonSerializer2 == null) {
            jsonSerializer2 = this._valueSerializer;
        }
        JsonSerializer<?> findConvertingContentSerializer = findConvertingContentSerializer(serializerProvider, beanProperty, jsonSerializer2);
        if (findConvertingContentSerializer != null) {
            findConvertingContentSerializer = serializerProvider.handleSecondaryContextualization(findConvertingContentSerializer, beanProperty);
        } else if (this._valueTypeIsStatic && !this._valueType.isJavaLangObject()) {
            findConvertingContentSerializer = serializerProvider.findValueSerializer(this._valueType, beanProperty);
        }
        JsonSerializer<?> jsonSerializer3 = findConvertingContentSerializer;
        if (jsonSerializer == null) {
            jsonSerializer = this._keySerializer;
        }
        JsonSerializer<?> findKeySerializer2 = jsonSerializer == null ? serializerProvider.findKeySerializer(this._keyType, beanProperty) : serializerProvider.handleSecondaryContextualization(jsonSerializer, beanProperty);
        Set<String> set = this._ignoredEntries;
        boolean z = false;
        if (annotationIntrospector != null && member2 != null) {
            JsonIgnoreProperties.Value findPropertyIgnorals = annotationIntrospector.findPropertyIgnorals(member2);
            if (findPropertyIgnorals != null && (findIgnoredForSerialization = findPropertyIgnorals.findIgnoredForSerialization()) != null && !findIgnoredForSerialization.isEmpty()) {
                set = set == null ? new HashSet<>() : new HashSet(set);
                Iterator<String> it = findIgnoredForSerialization.iterator();
                while (it.hasNext()) {
                    set.add(it.next());
                }
            }
            Boolean findSerializationSortAlphabetically = annotationIntrospector.findSerializationSortAlphabetically(member2);
            if (findSerializationSortAlphabetically != null && findSerializationSortAlphabetically.booleanValue()) {
                z = true;
            }
        }
        Set<String> set2 = set;
        JsonFormat.Value findFormatOverrides = findFormatOverrides(serializerProvider, beanProperty, Map.class);
        MapSerializer withResolved = withResolved(beanProperty, findKeySerializer2, jsonSerializer3, set2, (findFormatOverrides == null || (feature = findFormatOverrides.getFeature(JsonFormat.Feature.WRITE_SORTED_MAP_ENTRIES)) == null) ? z : feature.booleanValue());
        if (obj != this._suppressableValue) {
            withResolved = withResolved.withContentInclusion(obj);
        }
        return (beanProperty == null || (member = beanProperty.getMember()) == null || (findFilterId = annotationIntrospector.findFilterId(member)) == null) ? withResolved : withResolved.withFilterId(findFilterId);
    }

    public void serializeFields(Map<?, ?> map, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (this._valueTypeSerializer != null) {
            serializeTypedFields(map, jsonGenerator, serializerProvider, null);
            return;
        }
        JsonSerializer<Object> jsonSerializer = this._keySerializer;
        Set<String> set = this._ignoredEntries;
        PropertySerializerMap propertySerializerMap = this._dynamicValueSerializers;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object value = entry.getValue();
            Object key = entry.getKey();
            if (key == null) {
                serializerProvider.findNullKeySerializer(this._keyType, this._property).serialize(null, jsonGenerator, serializerProvider);
            } else if (set == null || !set.contains(key)) {
                jsonSerializer.serialize(key, jsonGenerator, serializerProvider);
            }
            if (value == null) {
                serializerProvider.defaultSerializeNull(jsonGenerator);
            } else {
                JsonSerializer<Object> jsonSerializer2 = this._valueSerializer;
                if (jsonSerializer2 == null) {
                    Class<?> cls = value.getClass();
                    JsonSerializer<Object> serializerFor = propertySerializerMap.serializerFor(cls);
                    if (serializerFor == null) {
                        jsonSerializer2 = this._valueType.hasGenericTypes() ? _findAndAddDynamic(propertySerializerMap, serializerProvider.constructSpecializedType(this._valueType, cls), serializerProvider) : _findAndAddDynamic(propertySerializerMap, cls, serializerProvider);
                        propertySerializerMap = this._dynamicValueSerializers;
                    } else {
                        jsonSerializer2 = serializerFor;
                    }
                }
                try {
                    jsonSerializer2.serialize(value, jsonGenerator, serializerProvider);
                } catch (Exception e2) {
                    wrapAndThrow(serializerProvider, e2, map, HttpUrl.FRAGMENT_ENCODE_SET + key);
                }
            }
        }
    }

    public void serializeFieldsUsing(Map<?, ?> map, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, JsonSerializer<Object> jsonSerializer) throws IOException {
        JsonSerializer<Object> jsonSerializer2 = this._keySerializer;
        Set<String> set = this._ignoredEntries;
        TypeSerializer typeSerializer = this._valueTypeSerializer;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            if (set == null || !set.contains(key)) {
                if (key == null) {
                    serializerProvider.findNullKeySerializer(this._keyType, this._property).serialize(null, jsonGenerator, serializerProvider);
                } else {
                    jsonSerializer2.serialize(key, jsonGenerator, serializerProvider);
                }
                Object value = entry.getValue();
                if (value == null) {
                    serializerProvider.defaultSerializeNull(jsonGenerator);
                } else if (typeSerializer == null) {
                    try {
                        jsonSerializer.serialize(value, jsonGenerator, serializerProvider);
                    } catch (Exception e2) {
                        wrapAndThrow(serializerProvider, e2, map, HttpUrl.FRAGMENT_ENCODE_SET + key);
                    }
                } else {
                    jsonSerializer.serializeWithType(value, jsonGenerator, serializerProvider, typeSerializer);
                }
            }
        }
    }

    public void serializeFilteredFields(Map<?, ?> map, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, PropertyFilter propertyFilter, Object obj) throws IOException {
        JsonSerializer<Object> defaultNullValueSerializer;
        Set<String> set = this._ignoredEntries;
        PropertySerializerMap propertySerializerMap = this._dynamicValueSerializers;
        MapProperty mapProperty = new MapProperty(this._valueTypeSerializer, this._property);
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            if (set == null || !set.contains(key)) {
                JsonSerializer<Object> findNullKeySerializer = key == null ? serializerProvider.findNullKeySerializer(this._keyType, this._property) : this._keySerializer;
                Object value = entry.getValue();
                if (value != null) {
                    defaultNullValueSerializer = this._valueSerializer;
                    if (defaultNullValueSerializer == null) {
                        Class<?> cls = value.getClass();
                        JsonSerializer<Object> serializerFor = propertySerializerMap.serializerFor(cls);
                        if (serializerFor == null) {
                            defaultNullValueSerializer = this._valueType.hasGenericTypes() ? _findAndAddDynamic(propertySerializerMap, serializerProvider.constructSpecializedType(this._valueType, cls), serializerProvider) : _findAndAddDynamic(propertySerializerMap, cls, serializerProvider);
                            propertySerializerMap = this._dynamicValueSerializers;
                        } else {
                            defaultNullValueSerializer = serializerFor;
                        }
                    }
                    if (obj == JsonInclude.Include.NON_EMPTY && defaultNullValueSerializer.isEmpty(serializerProvider, value)) {
                    }
                } else if (obj == null) {
                    defaultNullValueSerializer = serializerProvider.getDefaultNullValueSerializer();
                }
                mapProperty.reset(key, findNullKeySerializer, defaultNullValueSerializer);
                try {
                    propertyFilter.serializeAsField(value, jsonGenerator, serializerProvider, mapProperty);
                } catch (Exception e2) {
                    wrapAndThrow(serializerProvider, e2, map, HttpUrl.FRAGMENT_ENCODE_SET + key);
                }
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:9|(2:49|50)(1:(1:15)(2:47|34))|16|(2:42|(2:46|34)(2:44|45))(5:18|19|(2:21|(3:23|(1:25)(1:27)|26)(1:28))|29|(2:33|34))|35|36|38|34|7) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0087, code lost:
    
        wrapAndThrow(r12, r3, r10, okhttp3.HttpUrl.FRAGMENT_ENCODE_SET + r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void serializeOptionalFields(java.util.Map<?, ?> r10, com.fasterxml.jackson.core.JsonGenerator r11, com.fasterxml.jackson.databind.SerializerProvider r12, java.lang.Object r13) throws java.io.IOException {
        /*
            r9 = this;
            com.fasterxml.jackson.databind.jsontype.TypeSerializer r0 = r9._valueTypeSerializer
            if (r0 == 0) goto L8
            r9.serializeTypedFields(r10, r11, r12, r13)
            return
        L8:
            java.util.Set<java.lang.String> r0 = r9._ignoredEntries
            com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap r1 = r9._dynamicValueSerializers
            java.util.Set r2 = r10.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L14:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L9d
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            if (r4 != 0) goto L2f
            com.fasterxml.jackson.databind.JavaType r5 = r9._keyType
            com.fasterxml.jackson.databind.BeanProperty r6 = r9._property
            com.fasterxml.jackson.databind.JsonSerializer r5 = r12.findNullKeySerializer(r5, r6)
            goto L3a
        L2f:
            if (r0 == 0) goto L38
            boolean r5 = r0.contains(r4)
            if (r5 == 0) goto L38
            goto L14
        L38:
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r5 = r9._keySerializer
        L3a:
            java.lang.Object r3 = r3.getValue()
            if (r3 != 0) goto L48
            if (r13 == 0) goto L43
            goto L14
        L43:
            com.fasterxml.jackson.databind.JsonSerializer r6 = r12.getDefaultNullValueSerializer()
            goto L7f
        L48:
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r6 = r9._valueSerializer
            if (r6 != 0) goto L74
            java.lang.Class r6 = r3.getClass()
            com.fasterxml.jackson.databind.JsonSerializer r7 = r1.serializerFor(r6)
            if (r7 != 0) goto L73
            com.fasterxml.jackson.databind.JavaType r7 = r9._valueType
            boolean r7 = r7.hasGenericTypes()
            if (r7 == 0) goto L69
            com.fasterxml.jackson.databind.JavaType r7 = r9._valueType
            com.fasterxml.jackson.databind.JavaType r6 = r12.constructSpecializedType(r7, r6)
            com.fasterxml.jackson.databind.JsonSerializer r1 = r9._findAndAddDynamic(r1, r6, r12)
            goto L6d
        L69:
            com.fasterxml.jackson.databind.JsonSerializer r1 = r9._findAndAddDynamic(r1, r6, r12)
        L6d:
            com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap r6 = r9._dynamicValueSerializers
            r8 = r6
            r6 = r1
            r1 = r8
            goto L74
        L73:
            r6 = r7
        L74:
            com.fasterxml.jackson.annotation.JsonInclude$Include r7 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY
            if (r13 != r7) goto L7f
            boolean r7 = r6.isEmpty(r12, r3)
            if (r7 == 0) goto L7f
            goto L14
        L7f:
            r5.serialize(r4, r11, r12)     // Catch: java.lang.Exception -> L86
            r6.serialize(r3, r11, r12)     // Catch: java.lang.Exception -> L86
            goto L14
        L86:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = ""
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r9.wrapAndThrow(r12, r3, r10, r4)
            goto L14
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.MapSerializer.serializeOptionalFields(java.util.Map, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider, java.lang.Object):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:4|(2:45|46)(1:(1:10)(2:43|30))|11|(2:38|(2:42|30)(2:40|41))(5:13|14|(3:16|(1:18)(1:36)|19)(1:37)|20|(2:34|30))|25|26|27|29|30|2) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007d, code lost:
    
        wrapAndThrow(r12, r3, r10, okhttp3.HttpUrl.FRAGMENT_ENCODE_SET + r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void serializeTypedFields(java.util.Map<?, ?> r10, com.fasterxml.jackson.core.JsonGenerator r11, com.fasterxml.jackson.databind.SerializerProvider r12, java.lang.Object r13) throws java.io.IOException {
        /*
            r9 = this;
            java.util.Set<java.lang.String> r0 = r9._ignoredEntries
            com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap r1 = r9._dynamicValueSerializers
            java.util.Set r2 = r10.entrySet()
            java.util.Iterator r2 = r2.iterator()
        Lc:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L93
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            if (r4 != 0) goto L27
            com.fasterxml.jackson.databind.JavaType r5 = r9._keyType
            com.fasterxml.jackson.databind.BeanProperty r6 = r9._property
            com.fasterxml.jackson.databind.JsonSerializer r5 = r12.findNullKeySerializer(r5, r6)
            goto L32
        L27:
            if (r0 == 0) goto L30
            boolean r5 = r0.contains(r4)
            if (r5 == 0) goto L30
            goto Lc
        L30:
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r5 = r9._keySerializer
        L32:
            java.lang.Object r3 = r3.getValue()
            if (r3 != 0) goto L40
            if (r13 == 0) goto L3b
            goto Lc
        L3b:
            com.fasterxml.jackson.databind.JsonSerializer r6 = r12.getDefaultNullValueSerializer()
            goto L73
        L40:
            java.lang.Class r6 = r3.getClass()
            com.fasterxml.jackson.databind.JsonSerializer r7 = r1.serializerFor(r6)
            if (r7 != 0) goto L67
            com.fasterxml.jackson.databind.JavaType r7 = r9._valueType
            boolean r7 = r7.hasGenericTypes()
            if (r7 == 0) goto L5d
            com.fasterxml.jackson.databind.JavaType r7 = r9._valueType
            com.fasterxml.jackson.databind.JavaType r6 = r12.constructSpecializedType(r7, r6)
            com.fasterxml.jackson.databind.JsonSerializer r1 = r9._findAndAddDynamic(r1, r6, r12)
            goto L61
        L5d:
            com.fasterxml.jackson.databind.JsonSerializer r1 = r9._findAndAddDynamic(r1, r6, r12)
        L61:
            com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap r6 = r9._dynamicValueSerializers
            r8 = r6
            r6 = r1
            r1 = r8
            goto L68
        L67:
            r6 = r7
        L68:
            com.fasterxml.jackson.annotation.JsonInclude$Include r7 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY
            if (r13 != r7) goto L73
            boolean r7 = r6.isEmpty(r12, r3)
            if (r7 == 0) goto L73
            goto Lc
        L73:
            r5.serialize(r4, r11, r12)
            com.fasterxml.jackson.databind.jsontype.TypeSerializer r5 = r9._valueTypeSerializer     // Catch: java.lang.Exception -> L7c
            r6.serializeWithType(r3, r11, r12, r5)     // Catch: java.lang.Exception -> L7c
            goto Lc
        L7c:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = ""
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r9.wrapAndThrow(r12, r3, r10, r4)
            goto Lc
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.MapSerializer.serializeTypedFields(java.util.Map, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider, java.lang.Object):void");
    }

    public MapSerializer withContentInclusion(Object obj) {
        if (obj == this._suppressableValue) {
            return this;
        }
        _ensureOverride();
        return new MapSerializer(this, this._valueTypeSerializer, obj);
    }

    public MapSerializer withFilterId(Object obj) {
        if (this._filterId == obj) {
            return this;
        }
        _ensureOverride();
        return new MapSerializer(this, obj, this._sortKeys);
    }

    public MapSerializer withResolved(BeanProperty beanProperty, JsonSerializer<?> jsonSerializer, JsonSerializer<?> jsonSerializer2, Set<String> set, boolean z) {
        _ensureOverride();
        MapSerializer mapSerializer = new MapSerializer(this, beanProperty, jsonSerializer, jsonSerializer2, set);
        return z != mapSerializer._sortKeys ? new MapSerializer(mapSerializer, this._filterId, z) : mapSerializer;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public MapSerializer _withValueTypeSerializer(TypeSerializer typeSerializer) {
        if (this._valueTypeSerializer == typeSerializer) {
            return this;
        }
        _ensureOverride();
        return new MapSerializer(this, typeSerializer, (Object) null);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean isEmpty(SerializerProvider serializerProvider, Map<?, ?> map) {
        if (map == null || map.isEmpty()) {
            return true;
        }
        Object obj = this._suppressableValue;
        if (obj == null || obj == JsonInclude.Include.ALWAYS) {
            return false;
        }
        JsonSerializer<Object> jsonSerializer = this._valueSerializer;
        if (jsonSerializer != null) {
            for (Object obj2 : map.values()) {
                if (obj2 != null && !jsonSerializer.isEmpty(serializerProvider, obj2)) {
                    return false;
                }
            }
            return true;
        }
        PropertySerializerMap propertySerializerMap = this._dynamicValueSerializers;
        for (Object obj3 : map.values()) {
            if (obj3 != null) {
                Class<?> cls = obj3.getClass();
                JsonSerializer<Object> serializerFor = propertySerializerMap.serializerFor(cls);
                if (serializerFor == null) {
                    try {
                        serializerFor = _findAndAddDynamic(propertySerializerMap, cls, serializerProvider);
                        propertySerializerMap = this._dynamicValueSerializers;
                    } catch (JsonMappingException unused) {
                        return false;
                    }
                }
                if (!serializerFor.isEmpty(serializerProvider, obj3)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(Map<?, ?> map, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        PropertyFilter findPropertyFilter;
        jsonGenerator.writeStartObject(map);
        if (!map.isEmpty()) {
            Object obj = this._suppressableValue;
            if (obj == JsonInclude.Include.ALWAYS) {
                obj = null;
            } else if (obj == null && !serializerProvider.isEnabled(SerializationFeature.WRITE_NULL_MAP_VALUES)) {
                obj = JsonInclude.Include.NON_NULL;
            }
            Object obj2 = obj;
            if (this._sortKeys || serializerProvider.isEnabled(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS)) {
                map = _orderEntries(map, jsonGenerator, serializerProvider, obj2);
            }
            Map<?, ?> map2 = map;
            Object obj3 = this._filterId;
            if (obj3 != null && (findPropertyFilter = findPropertyFilter(serializerProvider, obj3, map2)) != null) {
                serializeFilteredFields(map2, jsonGenerator, serializerProvider, findPropertyFilter, obj2);
            } else if (obj2 != null) {
                serializeOptionalFields(map2, jsonGenerator, serializerProvider, obj2);
            } else {
                JsonSerializer<Object> jsonSerializer = this._valueSerializer;
                if (jsonSerializer != null) {
                    serializeFieldsUsing(map2, jsonGenerator, serializerProvider, jsonSerializer);
                } else {
                    serializeFields(map2, jsonGenerator, serializerProvider);
                }
            }
        }
        jsonGenerator.writeEndObject();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serializeWithType(Map<?, ?> map, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        PropertyFilter findPropertyFilter;
        typeSerializer.writeTypePrefixForObject(map, jsonGenerator);
        jsonGenerator.setCurrentValue(map);
        if (!map.isEmpty()) {
            Object obj = this._suppressableValue;
            if (obj == JsonInclude.Include.ALWAYS) {
                obj = null;
            } else if (obj == null && !serializerProvider.isEnabled(SerializationFeature.WRITE_NULL_MAP_VALUES)) {
                obj = JsonInclude.Include.NON_NULL;
            }
            Object obj2 = obj;
            if (this._sortKeys || serializerProvider.isEnabled(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS)) {
                map = _orderEntries(map, jsonGenerator, serializerProvider, obj2);
            }
            Object obj3 = this._filterId;
            if (obj3 != null && (findPropertyFilter = findPropertyFilter(serializerProvider, obj3, map)) != null) {
                serializeFilteredFields(map, jsonGenerator, serializerProvider, findPropertyFilter, obj2);
            } else if (obj2 != null) {
                serializeOptionalFields(map, jsonGenerator, serializerProvider, obj2);
            } else {
                JsonSerializer<Object> jsonSerializer = this._valueSerializer;
                if (jsonSerializer != null) {
                    serializeFieldsUsing(map, jsonGenerator, serializerProvider, jsonSerializer);
                } else {
                    serializeFields(map, jsonGenerator, serializerProvider);
                }
            }
        }
        typeSerializer.writeTypeSuffixForObject(map, jsonGenerator);
    }

    protected final JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap propertySerializerMap, JavaType javaType, SerializerProvider serializerProvider) throws JsonMappingException {
        PropertySerializerMap.SerializerAndMapResult findAndAddSecondarySerializer = propertySerializerMap.findAndAddSecondarySerializer(javaType, serializerProvider, this._property);
        PropertySerializerMap propertySerializerMap2 = findAndAddSecondarySerializer.map;
        if (propertySerializerMap != propertySerializerMap2) {
            this._dynamicValueSerializers = propertySerializerMap2;
        }
        return findAndAddSecondarySerializer.serializer;
    }

    protected MapSerializer(MapSerializer mapSerializer, BeanProperty beanProperty, JsonSerializer<?> jsonSerializer, JsonSerializer<?> jsonSerializer2, Set<String> set) {
        super(Map.class, false);
        this._ignoredEntries = (set == null || set.isEmpty()) ? null : set;
        this._keyType = mapSerializer._keyType;
        this._valueType = mapSerializer._valueType;
        this._valueTypeIsStatic = mapSerializer._valueTypeIsStatic;
        this._valueTypeSerializer = mapSerializer._valueTypeSerializer;
        this._keySerializer = jsonSerializer;
        this._valueSerializer = jsonSerializer2;
        this._dynamicValueSerializers = mapSerializer._dynamicValueSerializers;
        this._property = beanProperty;
        this._filterId = mapSerializer._filterId;
        this._sortKeys = mapSerializer._sortKeys;
        this._suppressableValue = mapSerializer._suppressableValue;
    }

    protected MapSerializer(MapSerializer mapSerializer, TypeSerializer typeSerializer, Object obj) {
        super(Map.class, false);
        this._ignoredEntries = mapSerializer._ignoredEntries;
        this._keyType = mapSerializer._keyType;
        JavaType javaType = mapSerializer._valueType;
        this._valueType = javaType;
        this._valueTypeIsStatic = mapSerializer._valueTypeIsStatic;
        this._valueTypeSerializer = typeSerializer;
        this._keySerializer = mapSerializer._keySerializer;
        this._valueSerializer = mapSerializer._valueSerializer;
        this._dynamicValueSerializers = mapSerializer._dynamicValueSerializers;
        this._property = mapSerializer._property;
        this._filterId = mapSerializer._filterId;
        this._sortKeys = mapSerializer._sortKeys;
        if (obj == JsonInclude.Include.NON_ABSENT) {
            obj = javaType.isReferenceType() ? JsonInclude.Include.NON_EMPTY : JsonInclude.Include.NON_NULL;
        }
        this._suppressableValue = obj;
    }

    protected MapSerializer(MapSerializer mapSerializer, Object obj, boolean z) {
        super(Map.class, false);
        this._ignoredEntries = mapSerializer._ignoredEntries;
        this._keyType = mapSerializer._keyType;
        this._valueType = mapSerializer._valueType;
        this._valueTypeIsStatic = mapSerializer._valueTypeIsStatic;
        this._valueTypeSerializer = mapSerializer._valueTypeSerializer;
        this._keySerializer = mapSerializer._keySerializer;
        this._valueSerializer = mapSerializer._valueSerializer;
        this._dynamicValueSerializers = mapSerializer._dynamicValueSerializers;
        this._property = mapSerializer._property;
        this._filterId = obj;
        this._sortKeys = z;
        this._suppressableValue = mapSerializer._suppressableValue;
    }
}
