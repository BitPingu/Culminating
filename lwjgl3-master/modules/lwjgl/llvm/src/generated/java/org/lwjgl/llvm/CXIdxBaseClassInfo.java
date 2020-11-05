/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CXIdxBaseClassInfo {
 *     {@link CXIdxEntityInfo CXIdxEntityInfo} const * base;
 *     {@link CXCursor CXCursor} cursor;
 *     {@link CXIdxLoc CXIdxLoc} loc;
 * }</code></pre>
 */
public class CXIdxBaseClassInfo extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BASE,
        CURSOR,
        LOC;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(CXCursor.SIZEOF, CXCursor.ALIGNOF),
            __member(CXIdxLoc.SIZEOF, CXIdxLoc.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BASE = layout.offsetof(0);
        CURSOR = layout.offsetof(1);
        LOC = layout.offsetof(2);
    }

    /**
     * Creates a {@code CXIdxBaseClassInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CXIdxBaseClassInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link CXIdxEntityInfo} view of the struct pointed to by the {@code base} field. */
    @NativeType("CXIdxEntityInfo const *")
    public CXIdxEntityInfo base() { return nbase(address()); }
    /** Returns a {@link CXCursor} view of the {@code cursor} field. */
    public CXCursor cursor() { return ncursor(address()); }
    /** Returns a {@link CXIdxLoc} view of the {@code loc} field. */
    public CXIdxLoc loc() { return nloc(address()); }

    // -----------------------------------

    /** Returns a new {@code CXIdxBaseClassInfo} instance for the specified memory address. */
    public static CXIdxBaseClassInfo create(long address) {
        return wrap(CXIdxBaseClassInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXIdxBaseClassInfo createSafe(long address) {
        return address == NULL ? null : wrap(CXIdxBaseClassInfo.class, address);
    }

    /**
     * Create a {@link CXIdxBaseClassInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CXIdxBaseClassInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXIdxBaseClassInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #base}. */
    public static CXIdxEntityInfo nbase(long struct) { return CXIdxEntityInfo.create(memGetAddress(struct + CXIdxBaseClassInfo.BASE)); }
    /** Unsafe version of {@link #cursor}. */
    public static CXCursor ncursor(long struct) { return CXCursor.create(struct + CXIdxBaseClassInfo.CURSOR); }
    /** Unsafe version of {@link #loc}. */
    public static CXIdxLoc nloc(long struct) { return CXIdxLoc.create(struct + CXIdxBaseClassInfo.LOC); }

    // -----------------------------------

    /** An array of {@link CXIdxBaseClassInfo} structs. */
    public static class Buffer extends StructBuffer<CXIdxBaseClassInfo, Buffer> {

        private static final CXIdxBaseClassInfo ELEMENT_FACTORY = CXIdxBaseClassInfo.create(-1L);

        /**
         * Creates a new {@code CXIdxBaseClassInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CXIdxBaseClassInfo#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected CXIdxBaseClassInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link CXIdxEntityInfo} view of the struct pointed to by the {@code base} field. */
        @NativeType("CXIdxEntityInfo const *")
        public CXIdxEntityInfo base() { return CXIdxBaseClassInfo.nbase(address()); }
        /** Returns a {@link CXCursor} view of the {@code cursor} field. */
        public CXCursor cursor() { return CXIdxBaseClassInfo.ncursor(address()); }
        /** Returns a {@link CXIdxLoc} view of the {@code loc} field. */
        public CXIdxLoc loc() { return CXIdxBaseClassInfo.nloc(address()); }

    }

}