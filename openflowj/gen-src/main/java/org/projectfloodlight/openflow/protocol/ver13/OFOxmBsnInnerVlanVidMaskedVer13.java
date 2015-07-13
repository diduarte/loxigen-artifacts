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
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFOxmBsnInnerVlanVidMaskedVer13 implements OFOxmBsnInnerVlanVidMasked {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmBsnInnerVlanVidMaskedVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 8;

        private final static OFVlanVidMatch DEFAULT_VALUE = OFVlanVidMatch.NONE;
        private final static OFVlanVidMatch DEFAULT_VALUE_MASK = OFVlanVidMatch.NONE;

    // OF message fields
    private final OFVlanVidMatch value;
    private final OFVlanVidMatch mask;
//
    // Immutable default instance
    final static OFOxmBsnInnerVlanVidMaskedVer13 DEFAULT = new OFOxmBsnInnerVlanVidMaskedVer13(
        DEFAULT_VALUE, DEFAULT_VALUE_MASK
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmBsnInnerVlanVidMaskedVer13(OFVlanVidMatch value, OFVlanVidMatch mask) {
        if(value == null) {
            throw new NullPointerException("OFOxmBsnInnerVlanVidMaskedVer13: property value cannot be null");
        }
        if(mask == null) {
            throw new NullPointerException("OFOxmBsnInnerVlanVidMaskedVer13: property mask cannot be null");
        }
        this.value = value;
        this.mask = mask;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x33104L;
    }

    @Override
    public OFVlanVidMatch getValue() {
        return value;
    }

    @Override
    public OFVlanVidMatch getMask() {
        return mask;
    }

    @Override
    public MatchField<OFVlanVidMatch> getMatchField() {
        return MatchField.BSN_INNER_VLAN_VID;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    public OFOxm<OFVlanVidMatch> getCanonical() {
        if (OFVlanVidMatch.NO_MASK.equals(mask)) {
            return new OFOxmBsnInnerVlanVidVer13(value);
        } else if(OFVlanVidMatch.FULL_MASK.equals(mask)) {
            return null;
        } else {
            return this;
        }
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    public OFOxmBsnInnerVlanVidMasked.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmBsnInnerVlanVidMasked.Builder {
        final OFOxmBsnInnerVlanVidMaskedVer13 parentMessage;

        // OF message fields
        private boolean valueSet;
        private OFVlanVidMatch value;
        private boolean maskSet;
        private OFVlanVidMatch mask;

        BuilderWithParent(OFOxmBsnInnerVlanVidMaskedVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x33104L;
    }

    @Override
    public OFVlanVidMatch getValue() {
        return value;
    }

    @Override
    public OFOxmBsnInnerVlanVidMasked.Builder setValue(OFVlanVidMatch value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFVlanVidMatch getMask() {
        return mask;
    }

    @Override
    public OFOxmBsnInnerVlanVidMasked.Builder setMask(OFVlanVidMatch mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public MatchField<OFVlanVidMatch> getMatchField() {
        return MatchField.BSN_INNER_VLAN_VID;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    @Override
    public OFOxm<OFVlanVidMatch> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.3");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



        @Override
        public OFOxmBsnInnerVlanVidMasked build() {
                OFVlanVidMatch value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");
                OFVlanVidMatch mask = this.maskSet ? this.mask : parentMessage.mask;
                if(mask == null)
                    throw new NullPointerException("Property mask must not be null");

                //
                return new OFOxmBsnInnerVlanVidMaskedVer13(
                    value,
                    mask
                );
        }

    }

    static class Builder implements OFOxmBsnInnerVlanVidMasked.Builder {
        // OF message fields
        private boolean valueSet;
        private OFVlanVidMatch value;
        private boolean maskSet;
        private OFVlanVidMatch mask;

    @Override
    public long getTypeLen() {
        return 0x33104L;
    }

    @Override
    public OFVlanVidMatch getValue() {
        return value;
    }

    @Override
    public OFOxmBsnInnerVlanVidMasked.Builder setValue(OFVlanVidMatch value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFVlanVidMatch getMask() {
        return mask;
    }

    @Override
    public OFOxmBsnInnerVlanVidMasked.Builder setMask(OFVlanVidMatch mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public MatchField<OFVlanVidMatch> getMatchField() {
        return MatchField.BSN_INNER_VLAN_VID;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    @Override
    public OFOxm<OFVlanVidMatch> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.3");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

//
        @Override
        public OFOxmBsnInnerVlanVidMasked build() {
            OFVlanVidMatch value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");
            OFVlanVidMatch mask = this.maskSet ? this.mask : DEFAULT_VALUE_MASK;
            if(mask == null)
                throw new NullPointerException("Property mask must not be null");


            return new OFOxmBsnInnerVlanVidMaskedVer13(
                    value,
                    mask
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFOxmBsnInnerVlanVidMasked> {
        @Override
        public OFOxmBsnInnerVlanVidMasked readFrom(ChannelBuffer bb) throws OFParseError {
            // fixed value property typeLen == 0x33104L
            int typeLen = bb.readInt();
            if(typeLen != 0x33104)
                throw new OFParseError("Wrong typeLen: Expected=0x33104L(0x33104L), got="+typeLen);
            OFVlanVidMatch value = OFVlanVidMatch.read2Bytes(bb);
            OFVlanVidMatch mask = OFVlanVidMatch.read2Bytes(bb);

            OFOxmBsnInnerVlanVidMaskedVer13 oxmBsnInnerVlanVidMaskedVer13 = new OFOxmBsnInnerVlanVidMaskedVer13(
                    value,
                      mask
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmBsnInnerVlanVidMaskedVer13);
            return oxmBsnInnerVlanVidMaskedVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmBsnInnerVlanVidMaskedVer13Funnel FUNNEL = new OFOxmBsnInnerVlanVidMaskedVer13Funnel();
    static class OFOxmBsnInnerVlanVidMaskedVer13Funnel implements Funnel<OFOxmBsnInnerVlanVidMaskedVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmBsnInnerVlanVidMaskedVer13 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x33104L
            sink.putInt(0x33104);
            message.value.putTo(sink);
            message.mask.putTo(sink);
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmBsnInnerVlanVidMaskedVer13> {
        @Override
        public void write(ChannelBuffer bb, OFOxmBsnInnerVlanVidMaskedVer13 message) {
            // fixed value property typeLen = 0x33104L
            bb.writeInt(0x33104);
            message.value.write2Bytes(bb);
            message.mask.write2Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmBsnInnerVlanVidMaskedVer13(");
        b.append("value=").append(value);
        b.append(", ");
        b.append("mask=").append(mask);
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
        OFOxmBsnInnerVlanVidMaskedVer13 other = (OFOxmBsnInnerVlanVidMaskedVer13) obj;

        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        if (mask == null) {
            if (other.mask != null)
                return false;
        } else if (!mask.equals(other.mask))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((value == null) ? 0 : value.hashCode());
        result = prime * result + ((mask == null) ? 0 : mask.hashCode());
        return result;
    }

}
