// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver13;

import org.projectfloodlight.openflow.protocol.*;
import org.projectfloodlight.openflow.protocol.action.*;
import org.projectfloodlight.openflow.protocol.actionid.*;
import org.projectfloodlight.openflow.protocol.bsntlv.*;
import org.projectfloodlight.openflow.protocol.errormsg.*;
import org.projectfloodlight.openflow.protocol.meterband.*;
import org.projectfloodlight.openflow.protocol.instruction.*;
import org.projectfloodlight.openflow.protocol.instructionid.*;
import org.projectfloodlight.openflow.protocol.match.*;
import org.projectfloodlight.openflow.protocol.oxm.*;
import org.projectfloodlight.openflow.protocol.queueprop.*;
import org.projectfloodlight.openflow.types.*;
import org.projectfloodlight.openflow.util.*;
import org.projectfloodlight.openflow.exceptions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Set;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFBsnTlvIpv4SrcVer13 implements OFBsnTlvIpv4Src {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnTlvIpv4SrcVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 8;

        private final static IPv4Address DEFAULT_VALUE = IPv4Address.NONE;

    // OF message fields
    private final IPv4Address value;
//
    // Immutable default instance
    final static OFBsnTlvIpv4SrcVer13 DEFAULT = new OFBsnTlvIpv4SrcVer13(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnTlvIpv4SrcVer13(IPv4Address value) {
        if(value == null) {
            throw new NullPointerException("OFBsnTlvIpv4SrcVer13: property value cannot be null");
        }
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0x22;
    }

    @Override
    public IPv4Address getValue() {
        return value;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    public OFBsnTlvIpv4Src.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnTlvIpv4Src.Builder {
        final OFBsnTlvIpv4SrcVer13 parentMessage;

        // OF message fields
        private boolean valueSet;
        private IPv4Address value;

        BuilderWithParent(OFBsnTlvIpv4SrcVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0x22;
    }

    @Override
    public IPv4Address getValue() {
        return value;
    }

    @Override
    public OFBsnTlvIpv4Src.Builder setValue(IPv4Address value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



        @Override
        public OFBsnTlvIpv4Src build() {
                IPv4Address value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFBsnTlvIpv4SrcVer13(
                    value
                );
        }

    }

    static class Builder implements OFBsnTlvIpv4Src.Builder {
        // OF message fields
        private boolean valueSet;
        private IPv4Address value;

    @Override
    public int getType() {
        return 0x22;
    }

    @Override
    public IPv4Address getValue() {
        return value;
    }

    @Override
    public OFBsnTlvIpv4Src.Builder setValue(IPv4Address value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

//
        @Override
        public OFBsnTlvIpv4Src build() {
            IPv4Address value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFBsnTlvIpv4SrcVer13(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnTlvIpv4Src> {
        @Override
        public OFBsnTlvIpv4Src readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 0x22
            short type = bb.readShort();
            if(type != (short) 0x22)
                throw new OFParseError("Wrong type: Expected=0x22(0x22), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 8)
                throw new OFParseError("Wrong length: Expected=8(8), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            IPv4Address value = IPv4Address.read4Bytes(bb);

            OFBsnTlvIpv4SrcVer13 bsnTlvIpv4SrcVer13 = new OFBsnTlvIpv4SrcVer13(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnTlvIpv4SrcVer13);
            return bsnTlvIpv4SrcVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnTlvIpv4SrcVer13Funnel FUNNEL = new OFBsnTlvIpv4SrcVer13Funnel();
    static class OFBsnTlvIpv4SrcVer13Funnel implements Funnel<OFBsnTlvIpv4SrcVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnTlvIpv4SrcVer13 message, PrimitiveSink sink) {
            // fixed value property type = 0x22
            sink.putShort((short) 0x22);
            // fixed value property length = 8
            sink.putShort((short) 0x8);
            message.value.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnTlvIpv4SrcVer13> {
        @Override
        public void write(ByteBuf bb, OFBsnTlvIpv4SrcVer13 message) {
            // fixed value property type = 0x22
            bb.writeShort((short) 0x22);
            // fixed value property length = 8
            bb.writeShort((short) 0x8);
            message.value.write4Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnTlvIpv4SrcVer13(");
        b.append("value=").append(value);
        b.append(")");
        return b.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OFBsnTlvIpv4SrcVer13 other = (OFBsnTlvIpv4SrcVer13) obj;

        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

}
