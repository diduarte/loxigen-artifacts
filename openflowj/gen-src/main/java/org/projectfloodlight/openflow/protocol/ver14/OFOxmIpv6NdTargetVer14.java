// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver14;

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

class OFOxmIpv6NdTargetVer14 implements OFOxmIpv6NdTarget {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmIpv6NdTargetVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int LENGTH = 20;

        private final static IPv6Address DEFAULT_VALUE = IPv6Address.NONE;

    // OF message fields
    private final IPv6Address value;
//
    // Immutable default instance
    final static OFOxmIpv6NdTargetVer14 DEFAULT = new OFOxmIpv6NdTargetVer14(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmIpv6NdTargetVer14(IPv6Address value) {
        if(value == null) {
            throw new NullPointerException("OFOxmIpv6NdTargetVer14: property value cannot be null");
        }
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x80003e10L;
    }

    @Override
    public IPv6Address getValue() {
        return value;
    }

    @Override
    public MatchField<IPv6Address> getMatchField() {
        return MatchField.IPV6_ND_TARGET;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    public OFOxm<IPv6Address> getCanonical() {
        // exact match OXM is always canonical
        return this;
    }

    @Override
    public IPv6Address getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.4");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



    public OFOxmIpv6NdTarget.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmIpv6NdTarget.Builder {
        final OFOxmIpv6NdTargetVer14 parentMessage;

        // OF message fields
        private boolean valueSet;
        private IPv6Address value;

        BuilderWithParent(OFOxmIpv6NdTargetVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x80003e10L;
    }

    @Override
    public IPv6Address getValue() {
        return value;
    }

    @Override
    public OFOxmIpv6NdTarget.Builder setValue(IPv6Address value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<IPv6Address> getMatchField() {
        return MatchField.IPV6_ND_TARGET;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<IPv6Address> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.4");
    }

    @Override
    public IPv6Address getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.4");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



        @Override
        public OFOxmIpv6NdTarget build() {
                IPv6Address value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFOxmIpv6NdTargetVer14(
                    value
                );
        }

    }

    static class Builder implements OFOxmIpv6NdTarget.Builder {
        // OF message fields
        private boolean valueSet;
        private IPv6Address value;

    @Override
    public long getTypeLen() {
        return 0x80003e10L;
    }

    @Override
    public IPv6Address getValue() {
        return value;
    }

    @Override
    public OFOxmIpv6NdTarget.Builder setValue(IPv6Address value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<IPv6Address> getMatchField() {
        return MatchField.IPV6_ND_TARGET;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<IPv6Address> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.4");
    }

    @Override
    public IPv6Address getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.4");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

//
        @Override
        public OFOxmIpv6NdTarget build() {
            IPv6Address value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFOxmIpv6NdTargetVer14(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFOxmIpv6NdTarget> {
        @Override
        public OFOxmIpv6NdTarget readFrom(ByteBuf bb) throws OFParseError {
            // fixed value property typeLen == 0x80003e10L
            int typeLen = bb.readInt();
            if(typeLen != (int) 0x80003e10)
                throw new OFParseError("Wrong typeLen: Expected=0x80003e10L(0x80003e10L), got="+typeLen);
            IPv6Address value = IPv6Address.read16Bytes(bb);

            OFOxmIpv6NdTargetVer14 oxmIpv6NdTargetVer14 = new OFOxmIpv6NdTargetVer14(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmIpv6NdTargetVer14);
            return oxmIpv6NdTargetVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmIpv6NdTargetVer14Funnel FUNNEL = new OFOxmIpv6NdTargetVer14Funnel();
    static class OFOxmIpv6NdTargetVer14Funnel implements Funnel<OFOxmIpv6NdTargetVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmIpv6NdTargetVer14 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x80003e10L
            sink.putInt((int) 0x80003e10);
            message.value.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmIpv6NdTargetVer14> {
        @Override
        public void write(ByteBuf bb, OFOxmIpv6NdTargetVer14 message) {
            // fixed value property typeLen = 0x80003e10L
            bb.writeInt((int) 0x80003e10);
            message.value.write16Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmIpv6NdTargetVer14(");
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
        OFOxmIpv6NdTargetVer14 other = (OFOxmIpv6NdTargetVer14) obj;

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
