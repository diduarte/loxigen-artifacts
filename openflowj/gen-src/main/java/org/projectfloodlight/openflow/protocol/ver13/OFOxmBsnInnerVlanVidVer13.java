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

class OFOxmBsnInnerVlanVidVer13 implements OFOxmBsnInnerVlanVid {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmBsnInnerVlanVidVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 6;

        private final static OFVlanVidMatch DEFAULT_VALUE = OFVlanVidMatch.NONE;

    // OF message fields
    private final OFVlanVidMatch value;
//
    // Immutable default instance
    final static OFOxmBsnInnerVlanVidVer13 DEFAULT = new OFOxmBsnInnerVlanVidVer13(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmBsnInnerVlanVidVer13(OFVlanVidMatch value) {
        if(value == null) {
            throw new NullPointerException("OFOxmBsnInnerVlanVidVer13: property value cannot be null");
        }
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x33002L;
    }

    @Override
    public OFVlanVidMatch getValue() {
        return value;
    }

    @Override
    public MatchField<OFVlanVidMatch> getMatchField() {
        return MatchField.BSN_INNER_VLAN_VID;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    public OFOxm<OFVlanVidMatch> getCanonical() {
        // exact match OXM is always canonical
        return this;
    }

    @Override
    public OFVlanVidMatch getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.3");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    public OFOxmBsnInnerVlanVid.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmBsnInnerVlanVid.Builder {
        final OFOxmBsnInnerVlanVidVer13 parentMessage;

        // OF message fields
        private boolean valueSet;
        private OFVlanVidMatch value;

        BuilderWithParent(OFOxmBsnInnerVlanVidVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x33002L;
    }

    @Override
    public OFVlanVidMatch getValue() {
        return value;
    }

    @Override
    public OFOxmBsnInnerVlanVid.Builder setValue(OFVlanVidMatch value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<OFVlanVidMatch> getMatchField() {
        return MatchField.BSN_INNER_VLAN_VID;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<OFVlanVidMatch> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.3");
    }

    @Override
    public OFVlanVidMatch getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.3");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



        @Override
        public OFOxmBsnInnerVlanVid build() {
                OFVlanVidMatch value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFOxmBsnInnerVlanVidVer13(
                    value
                );
        }

    }

    static class Builder implements OFOxmBsnInnerVlanVid.Builder {
        // OF message fields
        private boolean valueSet;
        private OFVlanVidMatch value;

    @Override
    public long getTypeLen() {
        return 0x33002L;
    }

    @Override
    public OFVlanVidMatch getValue() {
        return value;
    }

    @Override
    public OFOxmBsnInnerVlanVid.Builder setValue(OFVlanVidMatch value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<OFVlanVidMatch> getMatchField() {
        return MatchField.BSN_INNER_VLAN_VID;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<OFVlanVidMatch> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.3");
    }

    @Override
    public OFVlanVidMatch getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.3");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

//
        @Override
        public OFOxmBsnInnerVlanVid build() {
            OFVlanVidMatch value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFOxmBsnInnerVlanVidVer13(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFOxmBsnInnerVlanVid> {
        @Override
        public OFOxmBsnInnerVlanVid readFrom(ChannelBuffer bb) throws OFParseError {
            // fixed value property typeLen == 0x33002L
            int typeLen = bb.readInt();
            if(typeLen != 0x33002)
                throw new OFParseError("Wrong typeLen: Expected=0x33002L(0x33002L), got="+typeLen);
            OFVlanVidMatch value = OFVlanVidMatch.read2Bytes(bb);

            OFOxmBsnInnerVlanVidVer13 oxmBsnInnerVlanVidVer13 = new OFOxmBsnInnerVlanVidVer13(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmBsnInnerVlanVidVer13);
            return oxmBsnInnerVlanVidVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmBsnInnerVlanVidVer13Funnel FUNNEL = new OFOxmBsnInnerVlanVidVer13Funnel();
    static class OFOxmBsnInnerVlanVidVer13Funnel implements Funnel<OFOxmBsnInnerVlanVidVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmBsnInnerVlanVidVer13 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x33002L
            sink.putInt(0x33002);
            message.value.putTo(sink);
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmBsnInnerVlanVidVer13> {
        @Override
        public void write(ChannelBuffer bb, OFOxmBsnInnerVlanVidVer13 message) {
            // fixed value property typeLen = 0x33002L
            bb.writeInt(0x33002);
            message.value.write2Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmBsnInnerVlanVidVer13(");
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
        OFOxmBsnInnerVlanVidVer13 other = (OFOxmBsnInnerVlanVidVer13) obj;

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
