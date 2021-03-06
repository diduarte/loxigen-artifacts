// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_interface.java
// Do not modify

package org.projectfloodlight.openflow.protocol;

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
import java.util.List;
import io.netty.buffer.ByteBuf;

public interface OFPortStatsEntry extends OFObject {
    OFPort getPortNo();
    U64 getRxPackets();
    U64 getTxPackets();
    U64 getRxBytes();
    U64 getTxBytes();
    U64 getRxDropped();
    U64 getTxDropped();
    U64 getRxErrors();
    U64 getTxErrors();
    U64 getRxFrameErr() throws UnsupportedOperationException;
    U64 getRxOverErr() throws UnsupportedOperationException;
    U64 getRxCrcErr() throws UnsupportedOperationException;
    U64 getCollisions() throws UnsupportedOperationException;
    long getDurationSec() throws UnsupportedOperationException;
    long getDurationNsec() throws UnsupportedOperationException;
    List<OFPortStatsProp> getProperties() throws UnsupportedOperationException;
    OFVersion getVersion();


    void writeTo(ByteBuf channelBuffer);

    Builder createBuilder();
    public interface Builder  {
        OFPortStatsEntry build();
        OFPort getPortNo();
        Builder setPortNo(OFPort portNo);
        U64 getRxPackets();
        Builder setRxPackets(U64 rxPackets);
        U64 getTxPackets();
        Builder setTxPackets(U64 txPackets);
        U64 getRxBytes();
        Builder setRxBytes(U64 rxBytes);
        U64 getTxBytes();
        Builder setTxBytes(U64 txBytes);
        U64 getRxDropped();
        Builder setRxDropped(U64 rxDropped);
        U64 getTxDropped();
        Builder setTxDropped(U64 txDropped);
        U64 getRxErrors();
        Builder setRxErrors(U64 rxErrors);
        U64 getTxErrors();
        Builder setTxErrors(U64 txErrors);
        U64 getRxFrameErr() throws UnsupportedOperationException;
        Builder setRxFrameErr(U64 rxFrameErr) throws UnsupportedOperationException;
        U64 getRxOverErr() throws UnsupportedOperationException;
        Builder setRxOverErr(U64 rxOverErr) throws UnsupportedOperationException;
        U64 getRxCrcErr() throws UnsupportedOperationException;
        Builder setRxCrcErr(U64 rxCrcErr) throws UnsupportedOperationException;
        U64 getCollisions() throws UnsupportedOperationException;
        Builder setCollisions(U64 collisions) throws UnsupportedOperationException;
        long getDurationSec() throws UnsupportedOperationException;
        Builder setDurationSec(long durationSec) throws UnsupportedOperationException;
        long getDurationNsec() throws UnsupportedOperationException;
        Builder setDurationNsec(long durationNsec) throws UnsupportedOperationException;
        List<OFPortStatsProp> getProperties() throws UnsupportedOperationException;
        Builder setProperties(List<OFPortStatsProp> properties) throws UnsupportedOperationException;
        OFVersion getVersion();
    }
}
