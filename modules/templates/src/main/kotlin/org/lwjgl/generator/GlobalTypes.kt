/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator

val void = NativeType("void", TypeMapping.VOID)
val voidptr = "void".p
val voidptr_p = voidptr.p
val void_p = PointerType("void", PointerMapping.DATA)
val void_pp = void_p.p

val char = IntegerType("char", PrimitiveMapping.BYTE)
val short = IntegerType("short", PrimitiveMapping.SHORT)
val int = IntegerType("int", PrimitiveMapping.INT)
val float = PrimitiveType("float", PrimitiveMapping.FLOAT)
val double = PrimitiveType("double", PrimitiveMapping.DOUBLE)

val int8_t = IntegerType("int8_t", PrimitiveMapping.BYTE)
val uint8_t = IntegerType("uint8_t", PrimitiveMapping.BYTE, unsigned = true)
val int16_t = IntegerType("int16_t", PrimitiveMapping.SHORT)
val uint16_t = IntegerType("uint16_t", PrimitiveMapping.SHORT, unsigned = true)
val int32_t = IntegerType("int32_t", PrimitiveMapping.INT)
val uint32_t = IntegerType("uint32_t", PrimitiveMapping.INT, unsigned = true)
val int64_t = IntegerType("int64_t", PrimitiveMapping.LONG)
val uint64_t = IntegerType("uint64_t", PrimitiveMapping.LONG, unsigned = true)

val size_t = IntegerType("size_t", PrimitiveMapping.POINTER, unsigned = true)
val ptrdiff_t = IntegerType("ptrdiff_t", PrimitiveMapping.POINTER)
val intptr_t = IntegerType("intptr_t", PrimitiveMapping.POINTER)
val uintptr_t = IntegerType("uintptr_t", PrimitiveMapping.POINTER, unsigned = true)

val char_p = char.p
val short_p = short.p
val short_pp = short_p.p
val int_p = int.p
val float_p = float.p
val float_pp = float_p.p
val double_p = double.p
val size_t_p = size_t.p

val char_pp = char_p.p

val unsigned_char = IntegerType("unsigned char", PrimitiveMapping.BYTE, unsigned = true)
val unsigned_short = IntegerType("unsigned short", PrimitiveMapping.SHORT, unsigned = true)
val unsigned_int = IntegerType("unsigned int", PrimitiveMapping.INT, unsigned = true)

val unsigned_char_p = unsigned_char.p
val unsigned_short_p = unsigned_short.p
val unsigned_int_p = unsigned_int.p

val unsigned_char_pp = unsigned_char_p.p

// strings

val charASCII = CharType("char", CharMapping.ASCII) // for struct members
val charASCII_p = CharSequenceType(name = "char", charMapping = CharMapping.ASCII)
val charASCII_pp = charASCII_p.p

val charUTF8 = CharType("char", CharMapping.UTF8) // for struct members
val charUTF8_p = CharSequenceType(name = "char", charMapping = CharMapping.UTF8)
val charUTF8_pp = charUTF8_p.p