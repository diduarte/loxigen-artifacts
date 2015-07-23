// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver10;

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
import com.google.common.collect.ImmutableSet;
import java.util.List;
import javax.annotation.Nonnull;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFPortDescVer10 implements OFPortDesc {
    private static final Logger logger = LoggerFactory.getLogger(OFPortDescVer10.class);
    // version: 1.0
    final static byte WIRE_VERSION = 1;
    final static int LENGTH = 48;

        private final static OFPort DEFAULT_PORT_NO = OFPort.ANY;
        private final static MacAddress DEFAULT_HW_ADDR = MacAddress.NONE;
        private final static String DEFAULT_NAME = "";
        private final static Set<OFPortConfig> DEFAULT_CONFIG = ImmutableSet.<OFPortConfig>of();
        private final static Set<OFPortState> DEFAULT_STATE = ImmutableSet.<OFPortState>of();
        private final static Set<OFPortFeatures> DEFAULT_CURR = ImmutableSet.<OFPortFeatures>of();
        private final static Set<OFPortFeatures> DEFAULT_ADVERTISED = ImmutableSet.<OFPortFeatures>of();
        private final static Set<OFPortFeatures> DEFAULT_SUPPORTED = ImmutableSet.<OFPortFeatures>of();
        private final static Set<OFPortFeatures> DEFAULT_PEER = ImmutableSet.<OFPortFeatures>of();

    // OF message fields
    private final OFPort portNo;
    private final MacAddress hwAddr;
    private final String name;
    private final Set<OFPortConfig> config;
    private final Set<OFPortState> state;
    private final Set<OFPortFeatures> curr;
    private final Set<OFPortFeatures> advertised;
    private final Set<OFPortFeatures> supported;
    private final Set<OFPortFeatures> peer;
//
    // Immutable default instance
    final static OFPortDescVer10 DEFAULT = new OFPortDescVer10(
        DEFAULT_PORT_NO, DEFAULT_HW_ADDR, DEFAULT_NAME, DEFAULT_CONFIG, DEFAULT_STATE, DEFAULT_CURR, DEFAULT_ADVERTISED, DEFAULT_SUPPORTED, DEFAULT_PEER
    );

    // package private constructor - used by readers, builders, and factory
    OFPortDescVer10(OFPort portNo, MacAddress hwAddr, String name, Set<OFPortConfig> config, Set<OFPortState> state, Set<OFPortFeatures> curr, Set<OFPortFeatures> advertised, Set<OFPortFeatures> supported, Set<OFPortFeatures> peer) {
        if(portNo == null) {
            throw new NullPointerException("OFPortDescVer10: property portNo cannot be null");
        }
        if(hwAddr == null) {
            throw new NullPointerException("OFPortDescVer10: property hwAddr cannot be null");
        }
        if(name == null) {
            throw new NullPointerException("OFPortDescVer10: property name cannot be null");
        }
        if(config == null) {
            throw new NullPointerException("OFPortDescVer10: property config cannot be null");
        }
        if(state == null) {
            throw new NullPointerException("OFPortDescVer10: property state cannot be null");
        }
        if(curr == null) {
            throw new NullPointerException("OFPortDescVer10: property curr cannot be null");
        }
        if(advertised == null) {
            throw new NullPointerException("OFPortDescVer10: property advertised cannot be null");
        }
        if(supported == null) {
            throw new NullPointerException("OFPortDescVer10: property supported cannot be null");
        }
        if(peer == null) {
            throw new NullPointerException("OFPortDescVer10: property peer cannot be null");
        }
        this.portNo = portNo;
        this.hwAddr = hwAddr;
        this.name = name;
        this.config = config;
        this.state = state;
        this.curr = curr;
        this.advertised = advertised;
        this.supported = supported;
        this.peer = peer;
    }

    // Accessors for OF message fields
    @Override
    public OFPort getPortNo() {
        return portNo;
    }

    @Override
    public MacAddress getHwAddr() {
        return hwAddr;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Set<OFPortConfig> getConfig() {
        return config;
    }

    @Override
    public Set<OFPortState> getState() {
        return state;
    }

    @Override
    public Set<OFPortFeatures> getCurr() {
        return curr;
    }

    @Override
    public Set<OFPortFeatures> getAdvertised() {
        return advertised;
    }

    @Override
    public Set<OFPortFeatures> getSupported() {
        return supported;
    }

    @Override
    public Set<OFPortFeatures> getPeer() {
        return peer;
    }

    @Override
    public long getCurrSpeed()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property currSpeed not supported in version 1.0");
    }

    @Override
    public long getMaxSpeed()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property maxSpeed not supported in version 1.0");
    }

    @Override
    public List<OFPortDescProp> getProperties()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property properties not supported in version 1.0");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_10;
    }



    /**
     * Returns true if the port is up, i.e., it's neither administratively
     * down nor link down. It currently does NOT take STP state into
     * consideration
     * @return whether the port is up
     */
    public boolean isEnabled() {
        return (!state.contains(OFPortState.LINK_DOWN) && !config.contains(OFPortConfig.PORT_DOWN));
    }

    /**
     * Returns the current generation ID of this port.
     *
     * The generationId is reported by the switch as a @{link OFPortDescProp} in
     * @link{OFPortDescStatsReply} and @link{OFPortStatus} messages. If the
     * current OFPortDesc does not contain a generation Id, returns U64.ZERO;
     *
     * For OpenFlow versions earlier than 1.4, always returns U64.ZERO;
     *
     * @return the generation ID or U64.NULL if not reported
     * @since 1.4
     */
     @Nonnull
     public U64 getBsnGenerationId() {
         return U64.ZERO;
     }

    public OFPortDesc.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFPortDesc.Builder {
        final OFPortDescVer10 parentMessage;

        // OF message fields
        private boolean portNoSet;
        private OFPort portNo;
        private boolean hwAddrSet;
        private MacAddress hwAddr;
        private boolean nameSet;
        private String name;
        private boolean configSet;
        private Set<OFPortConfig> config;
        private boolean stateSet;
        private Set<OFPortState> state;
        private boolean currSet;
        private Set<OFPortFeatures> curr;
        private boolean advertisedSet;
        private Set<OFPortFeatures> advertised;
        private boolean supportedSet;
        private Set<OFPortFeatures> supported;
        private boolean peerSet;
        private Set<OFPortFeatures> peer;

        BuilderWithParent(OFPortDescVer10 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFPort getPortNo() {
        return portNo;
    }

    @Override
    public OFPortDesc.Builder setPortNo(OFPort portNo) {
        this.portNo = portNo;
        this.portNoSet = true;
        return this;
    }
    @Override
    public MacAddress getHwAddr() {
        return hwAddr;
    }

    @Override
    public OFPortDesc.Builder setHwAddr(MacAddress hwAddr) {
        this.hwAddr = hwAddr;
        this.hwAddrSet = true;
        return this;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public OFPortDesc.Builder setName(String name) {
        this.name = name;
        this.nameSet = true;
        return this;
    }
    @Override
    public Set<OFPortConfig> getConfig() {
        return config;
    }

    @Override
    public OFPortDesc.Builder setConfig(Set<OFPortConfig> config) {
        this.config = config;
        this.configSet = true;
        return this;
    }
    @Override
    public Set<OFPortState> getState() {
        return state;
    }

    @Override
    public OFPortDesc.Builder setState(Set<OFPortState> state) {
        this.state = state;
        this.stateSet = true;
        return this;
    }
    @Override
    public Set<OFPortFeatures> getCurr() {
        return curr;
    }

    @Override
    public OFPortDesc.Builder setCurr(Set<OFPortFeatures> curr) {
        this.curr = curr;
        this.currSet = true;
        return this;
    }
    @Override
    public Set<OFPortFeatures> getAdvertised() {
        return advertised;
    }

    @Override
    public OFPortDesc.Builder setAdvertised(Set<OFPortFeatures> advertised) {
        this.advertised = advertised;
        this.advertisedSet = true;
        return this;
    }
    @Override
    public Set<OFPortFeatures> getSupported() {
        return supported;
    }

    @Override
    public OFPortDesc.Builder setSupported(Set<OFPortFeatures> supported) {
        this.supported = supported;
        this.supportedSet = true;
        return this;
    }
    @Override
    public Set<OFPortFeatures> getPeer() {
        return peer;
    }

    @Override
    public OFPortDesc.Builder setPeer(Set<OFPortFeatures> peer) {
        this.peer = peer;
        this.peerSet = true;
        return this;
    }
    @Override
    public long getCurrSpeed()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property currSpeed not supported in version 1.0");
    }

    @Override
    public OFPortDesc.Builder setCurrSpeed(long currSpeed) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property currSpeed not supported in version 1.0");
    }
    @Override
    public long getMaxSpeed()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property maxSpeed not supported in version 1.0");
    }

    @Override
    public OFPortDesc.Builder setMaxSpeed(long maxSpeed) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property maxSpeed not supported in version 1.0");
    }
    @Override
    public List<OFPortDescProp> getProperties()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property properties not supported in version 1.0");
    }

    @Override
    public OFPortDesc.Builder setProperties(List<OFPortDescProp> properties) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property properties not supported in version 1.0");
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_10;
    }



        @Override
        public OFPortDesc build() {
                OFPort portNo = this.portNoSet ? this.portNo : parentMessage.portNo;
                if(portNo == null)
                    throw new NullPointerException("Property portNo must not be null");
                MacAddress hwAddr = this.hwAddrSet ? this.hwAddr : parentMessage.hwAddr;
                if(hwAddr == null)
                    throw new NullPointerException("Property hwAddr must not be null");
                String name = this.nameSet ? this.name : parentMessage.name;
                if(name == null)
                    throw new NullPointerException("Property name must not be null");
                Set<OFPortConfig> config = this.configSet ? this.config : parentMessage.config;
                if(config == null)
                    throw new NullPointerException("Property config must not be null");
                Set<OFPortState> state = this.stateSet ? this.state : parentMessage.state;
                if(state == null)
                    throw new NullPointerException("Property state must not be null");
                Set<OFPortFeatures> curr = this.currSet ? this.curr : parentMessage.curr;
                if(curr == null)
                    throw new NullPointerException("Property curr must not be null");
                Set<OFPortFeatures> advertised = this.advertisedSet ? this.advertised : parentMessage.advertised;
                if(advertised == null)
                    throw new NullPointerException("Property advertised must not be null");
                Set<OFPortFeatures> supported = this.supportedSet ? this.supported : parentMessage.supported;
                if(supported == null)
                    throw new NullPointerException("Property supported must not be null");
                Set<OFPortFeatures> peer = this.peerSet ? this.peer : parentMessage.peer;
                if(peer == null)
                    throw new NullPointerException("Property peer must not be null");

                //
                return new OFPortDescVer10(
                    portNo,
                    hwAddr,
                    name,
                    config,
                    state,
                    curr,
                    advertised,
                    supported,
                    peer
                );
        }

    }

    static class Builder implements OFPortDesc.Builder {
        // OF message fields
        private boolean portNoSet;
        private OFPort portNo;
        private boolean hwAddrSet;
        private MacAddress hwAddr;
        private boolean nameSet;
        private String name;
        private boolean configSet;
        private Set<OFPortConfig> config;
        private boolean stateSet;
        private Set<OFPortState> state;
        private boolean currSet;
        private Set<OFPortFeatures> curr;
        private boolean advertisedSet;
        private Set<OFPortFeatures> advertised;
        private boolean supportedSet;
        private Set<OFPortFeatures> supported;
        private boolean peerSet;
        private Set<OFPortFeatures> peer;

    @Override
    public OFPort getPortNo() {
        return portNo;
    }

    @Override
    public OFPortDesc.Builder setPortNo(OFPort portNo) {
        this.portNo = portNo;
        this.portNoSet = true;
        return this;
    }
    @Override
    public MacAddress getHwAddr() {
        return hwAddr;
    }

    @Override
    public OFPortDesc.Builder setHwAddr(MacAddress hwAddr) {
        this.hwAddr = hwAddr;
        this.hwAddrSet = true;
        return this;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public OFPortDesc.Builder setName(String name) {
        this.name = name;
        this.nameSet = true;
        return this;
    }
    @Override
    public Set<OFPortConfig> getConfig() {
        return config;
    }

    @Override
    public OFPortDesc.Builder setConfig(Set<OFPortConfig> config) {
        this.config = config;
        this.configSet = true;
        return this;
    }
    @Override
    public Set<OFPortState> getState() {
        return state;
    }

    @Override
    public OFPortDesc.Builder setState(Set<OFPortState> state) {
        this.state = state;
        this.stateSet = true;
        return this;
    }
    @Override
    public Set<OFPortFeatures> getCurr() {
        return curr;
    }

    @Override
    public OFPortDesc.Builder setCurr(Set<OFPortFeatures> curr) {
        this.curr = curr;
        this.currSet = true;
        return this;
    }
    @Override
    public Set<OFPortFeatures> getAdvertised() {
        return advertised;
    }

    @Override
    public OFPortDesc.Builder setAdvertised(Set<OFPortFeatures> advertised) {
        this.advertised = advertised;
        this.advertisedSet = true;
        return this;
    }
    @Override
    public Set<OFPortFeatures> getSupported() {
        return supported;
    }

    @Override
    public OFPortDesc.Builder setSupported(Set<OFPortFeatures> supported) {
        this.supported = supported;
        this.supportedSet = true;
        return this;
    }
    @Override
    public Set<OFPortFeatures> getPeer() {
        return peer;
    }

    @Override
    public OFPortDesc.Builder setPeer(Set<OFPortFeatures> peer) {
        this.peer = peer;
        this.peerSet = true;
        return this;
    }
    @Override
    public long getCurrSpeed()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property currSpeed not supported in version 1.0");
    }

    @Override
    public OFPortDesc.Builder setCurrSpeed(long currSpeed) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property currSpeed not supported in version 1.0");
    }
    @Override
    public long getMaxSpeed()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property maxSpeed not supported in version 1.0");
    }

    @Override
    public OFPortDesc.Builder setMaxSpeed(long maxSpeed) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property maxSpeed not supported in version 1.0");
    }
    @Override
    public List<OFPortDescProp> getProperties()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property properties not supported in version 1.0");
    }

    @Override
    public OFPortDesc.Builder setProperties(List<OFPortDescProp> properties) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property properties not supported in version 1.0");
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_10;
    }

//
        @Override
        public OFPortDesc build() {
            OFPort portNo = this.portNoSet ? this.portNo : DEFAULT_PORT_NO;
            if(portNo == null)
                throw new NullPointerException("Property portNo must not be null");
            MacAddress hwAddr = this.hwAddrSet ? this.hwAddr : DEFAULT_HW_ADDR;
            if(hwAddr == null)
                throw new NullPointerException("Property hwAddr must not be null");
            String name = this.nameSet ? this.name : DEFAULT_NAME;
            if(name == null)
                throw new NullPointerException("Property name must not be null");
            Set<OFPortConfig> config = this.configSet ? this.config : DEFAULT_CONFIG;
            if(config == null)
                throw new NullPointerException("Property config must not be null");
            Set<OFPortState> state = this.stateSet ? this.state : DEFAULT_STATE;
            if(state == null)
                throw new NullPointerException("Property state must not be null");
            Set<OFPortFeatures> curr = this.currSet ? this.curr : DEFAULT_CURR;
            if(curr == null)
                throw new NullPointerException("Property curr must not be null");
            Set<OFPortFeatures> advertised = this.advertisedSet ? this.advertised : DEFAULT_ADVERTISED;
            if(advertised == null)
                throw new NullPointerException("Property advertised must not be null");
            Set<OFPortFeatures> supported = this.supportedSet ? this.supported : DEFAULT_SUPPORTED;
            if(supported == null)
                throw new NullPointerException("Property supported must not be null");
            Set<OFPortFeatures> peer = this.peerSet ? this.peer : DEFAULT_PEER;
            if(peer == null)
                throw new NullPointerException("Property peer must not be null");


            return new OFPortDescVer10(
                    portNo,
                    hwAddr,
                    name,
                    config,
                    state,
                    curr,
                    advertised,
                    supported,
                    peer
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFPortDesc> {
        @Override
        public OFPortDesc readFrom(ChannelBuffer bb) throws OFParseError {
            OFPort portNo = OFPort.read2Bytes(bb);
            MacAddress hwAddr = MacAddress.read6Bytes(bb);
            String name = ChannelUtils.readFixedLengthString(bb, 16);
            Set<OFPortConfig> config = OFPortConfigSerializerVer10.readFrom(bb);
            Set<OFPortState> state = OFPortStateSerializerVer10.readFrom(bb);
            Set<OFPortFeatures> curr = OFPortFeaturesSerializerVer10.readFrom(bb);
            Set<OFPortFeatures> advertised = OFPortFeaturesSerializerVer10.readFrom(bb);
            Set<OFPortFeatures> supported = OFPortFeaturesSerializerVer10.readFrom(bb);
            Set<OFPortFeatures> peer = OFPortFeaturesSerializerVer10.readFrom(bb);

            OFPortDescVer10 portDescVer10 = new OFPortDescVer10(
                    portNo,
                      hwAddr,
                      name,
                      config,
                      state,
                      curr,
                      advertised,
                      supported,
                      peer
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", portDescVer10);
            return portDescVer10;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFPortDescVer10Funnel FUNNEL = new OFPortDescVer10Funnel();
    static class OFPortDescVer10Funnel implements Funnel<OFPortDescVer10> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFPortDescVer10 message, PrimitiveSink sink) {
            message.portNo.putTo(sink);
            message.hwAddr.putTo(sink);
            sink.putUnencodedChars(message.name);
            OFPortConfigSerializerVer10.putTo(message.config, sink);
            OFPortStateSerializerVer10.putTo(message.state, sink);
            OFPortFeaturesSerializerVer10.putTo(message.curr, sink);
            OFPortFeaturesSerializerVer10.putTo(message.advertised, sink);
            OFPortFeaturesSerializerVer10.putTo(message.supported, sink);
            OFPortFeaturesSerializerVer10.putTo(message.peer, sink);
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFPortDescVer10> {
        @Override
        public void write(ChannelBuffer bb, OFPortDescVer10 message) {
            message.portNo.write2Bytes(bb);
            message.hwAddr.write6Bytes(bb);
            ChannelUtils.writeFixedLengthString(bb, message.name, 16);
            OFPortConfigSerializerVer10.writeTo(bb, message.config);
            OFPortStateSerializerVer10.writeTo(bb, message.state);
            OFPortFeaturesSerializerVer10.writeTo(bb, message.curr);
            OFPortFeaturesSerializerVer10.writeTo(bb, message.advertised);
            OFPortFeaturesSerializerVer10.writeTo(bb, message.supported);
            OFPortFeaturesSerializerVer10.writeTo(bb, message.peer);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFPortDescVer10(");
        b.append("portNo=").append(portNo);
        b.append(", ");
        b.append("hwAddr=").append(hwAddr);
        b.append(", ");
        b.append("name=").append(name);
        b.append(", ");
        b.append("config=").append(config);
        b.append(", ");
        b.append("state=").append(state);
        b.append(", ");
        b.append("curr=").append(curr);
        b.append(", ");
        b.append("advertised=").append(advertised);
        b.append(", ");
        b.append("supported=").append(supported);
        b.append(", ");
        b.append("peer=").append(peer);
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
        OFPortDescVer10 other = (OFPortDescVer10) obj;

        if (portNo == null) {
            if (other.portNo != null)
                return false;
        } else if (!portNo.equals(other.portNo))
            return false;
        if (hwAddr == null) {
            if (other.hwAddr != null)
                return false;
        } else if (!hwAddr.equals(other.hwAddr))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (config == null) {
            if (other.config != null)
                return false;
        } else if (!config.equals(other.config))
            return false;
        if (state == null) {
            if (other.state != null)
                return false;
        } else if (!state.equals(other.state))
            return false;
        if (curr == null) {
            if (other.curr != null)
                return false;
        } else if (!curr.equals(other.curr))
            return false;
        if (advertised == null) {
            if (other.advertised != null)
                return false;
        } else if (!advertised.equals(other.advertised))
            return false;
        if (supported == null) {
            if (other.supported != null)
                return false;
        } else if (!supported.equals(other.supported))
            return false;
        if (peer == null) {
            if (other.peer != null)
                return false;
        } else if (!peer.equals(other.peer))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((portNo == null) ? 0 : portNo.hashCode());
        result = prime * result + ((hwAddr == null) ? 0 : hwAddr.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((config == null) ? 0 : config.hashCode());
        result = prime * result + ((state == null) ? 0 : state.hashCode());
        result = prime * result + ((curr == null) ? 0 : curr.hashCode());
        result = prime * result + ((advertised == null) ? 0 : advertised.hashCode());
        result = prime * result + ((supported == null) ? 0 : supported.hashCode());
        result = prime * result + ((peer == null) ? 0 : peer.hashCode());
        return result;
    }

}
