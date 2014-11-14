// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_factory_class.java
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
import java.util.Set;


public class OFBsnTlvsVer14 implements OFBsnTlvs {
    public final static OFBsnTlvsVer14 INSTANCE = new OFBsnTlvsVer14();




    public OFBsnTlvActorKey.Builder buildActorKey() {
        return new OFBsnTlvActorKeyVer14.Builder();
    }
    public OFBsnTlvActorKey actorKey(int value) {
        return new OFBsnTlvActorKeyVer14(
                value
                    );
    }

    public OFBsnTlvActorPortNum.Builder buildActorPortNum() {
        return new OFBsnTlvActorPortNumVer14.Builder();
    }
    public OFBsnTlvActorPortNum actorPortNum(int value) {
        return new OFBsnTlvActorPortNumVer14(
                value
                    );
    }

    public OFBsnTlvActorPortPriority.Builder buildActorPortPriority() {
        return new OFBsnTlvActorPortPriorityVer14.Builder();
    }
    public OFBsnTlvActorPortPriority actorPortPriority(int value) {
        return new OFBsnTlvActorPortPriorityVer14(
                value
                    );
    }

    public OFBsnTlvActorState.Builder buildActorState() {
        return new OFBsnTlvActorStateVer14.Builder();
    }
    public OFBsnTlvActorState actorState(Set<OFBsnLacpState> value) {
        return new OFBsnTlvActorStateVer14(
                value
                    );
    }

    public OFBsnTlvActorSystemMac.Builder buildActorSystemMac() {
        return new OFBsnTlvActorSystemMacVer14.Builder();
    }
    public OFBsnTlvActorSystemMac actorSystemMac(MacAddress value) {
        return new OFBsnTlvActorSystemMacVer14(
                value
                    );
    }

    public OFBsnTlvActorSystemPriority.Builder buildActorSystemPriority() {
        return new OFBsnTlvActorSystemPriorityVer14.Builder();
    }
    public OFBsnTlvActorSystemPriority actorSystemPriority(int value) {
        return new OFBsnTlvActorSystemPriorityVer14(
                value
                    );
    }

    public OFBsnTlvBroadcastQueryTimeout.Builder buildBroadcastQueryTimeout() {
        return new OFBsnTlvBroadcastQueryTimeoutVer14.Builder();
    }
    public OFBsnTlvBroadcastQueryTimeout broadcastQueryTimeout(long value) {
        return new OFBsnTlvBroadcastQueryTimeoutVer14(
                value
                    );
    }

    public OFBsnTlvCircuitId.Builder buildCircuitId() {
        return new OFBsnTlvCircuitIdVer14.Builder();
    }
    public OFBsnTlvCircuitId circuitId(byte[] value) {
        return new OFBsnTlvCircuitIdVer14(
                value
                    );
    }

    public OFBsnTlvConvergenceStatus.Builder buildConvergenceStatus() {
        return new OFBsnTlvConvergenceStatusVer14.Builder();
    }
    public OFBsnTlvConvergenceStatus convergenceStatus(short value) {
        return new OFBsnTlvConvergenceStatusVer14(
                value
                    );
    }

    public OFBsnTlvCrcEnabled.Builder buildCrcEnabled() {
        return new OFBsnTlvCrcEnabledVer14.Builder();
    }
    public OFBsnTlvCrcEnabled crcEnabled(short value) {
        return new OFBsnTlvCrcEnabledVer14(
                value
                    );
    }

    public OFBsnTlvData.Builder buildData() {
        return new OFBsnTlvDataVer14.Builder();
    }
    public OFBsnTlvData data(byte[] value) {
        return new OFBsnTlvDataVer14(
                value
                    );
    }

    public OFBsnTlvEthDst.Builder buildEthDst() {
        return new OFBsnTlvEthDstVer14.Builder();
    }
    public OFBsnTlvEthDst ethDst(MacAddress value) {
        return new OFBsnTlvEthDstVer14(
                value
                    );
    }

    public OFBsnTlvEthSrc.Builder buildEthSrc() {
        return new OFBsnTlvEthSrcVer14.Builder();
    }
    public OFBsnTlvEthSrc ethSrc(MacAddress value) {
        return new OFBsnTlvEthSrcVer14(
                value
                    );
    }

    public OFBsnTlvExternalGatewayIp.Builder buildExternalGatewayIp() {
        return new OFBsnTlvExternalGatewayIpVer14.Builder();
    }
    public OFBsnTlvExternalGatewayIp externalGatewayIp(IPv4Address value) {
        return new OFBsnTlvExternalGatewayIpVer14(
                value
                    );
    }

    public OFBsnTlvExternalGatewayMac.Builder buildExternalGatewayMac() {
        return new OFBsnTlvExternalGatewayMacVer14.Builder();
    }
    public OFBsnTlvExternalGatewayMac externalGatewayMac(MacAddress value) {
        return new OFBsnTlvExternalGatewayMacVer14(
                value
                    );
    }

    public OFBsnTlvExternalIp.Builder buildExternalIp() {
        return new OFBsnTlvExternalIpVer14.Builder();
    }
    public OFBsnTlvExternalIp externalIp(IPv4Address value) {
        return new OFBsnTlvExternalIpVer14(
                value
                    );
    }

    public OFBsnTlvExternalMac.Builder buildExternalMac() {
        return new OFBsnTlvExternalMacVer14.Builder();
    }
    public OFBsnTlvExternalMac externalMac(MacAddress value) {
        return new OFBsnTlvExternalMacVer14(
                value
                    );
    }

    public OFBsnTlvExternalNetmask.Builder buildExternalNetmask() {
        return new OFBsnTlvExternalNetmaskVer14.Builder();
    }
    public OFBsnTlvExternalNetmask externalNetmask(IPv4Address value) {
        return new OFBsnTlvExternalNetmaskVer14(
                value
                    );
    }

    public OFBsnTlvHeaderSize.Builder buildHeaderSize() {
        return new OFBsnTlvHeaderSizeVer14.Builder();
    }
    public OFBsnTlvHeaderSize headerSize(long value) {
        return new OFBsnTlvHeaderSizeVer14(
                value
                    );
    }

    public OFBsnTlvIdleNotification idleNotification() {
        return OFBsnTlvIdleNotificationVer14.INSTANCE;
    }

    public OFBsnTlvIdleTime.Builder buildIdleTime() {
        return new OFBsnTlvIdleTimeVer14.Builder();
    }
    public OFBsnTlvIdleTime idleTime(U64 value) {
        return new OFBsnTlvIdleTimeVer14(
                value
                    );
    }

    public OFBsnTlvIdleTimeout.Builder buildIdleTimeout() {
        return new OFBsnTlvIdleTimeoutVer14.Builder();
    }
    public OFBsnTlvIdleTimeout idleTimeout(long value) {
        return new OFBsnTlvIdleTimeoutVer14(
                value
                    );
    }

    public OFBsnTlvInternalGatewayMac.Builder buildInternalGatewayMac() {
        return new OFBsnTlvInternalGatewayMacVer14.Builder();
    }
    public OFBsnTlvInternalGatewayMac internalGatewayMac(MacAddress value) {
        return new OFBsnTlvInternalGatewayMacVer14(
                value
                    );
    }

    public OFBsnTlvInternalMac.Builder buildInternalMac() {
        return new OFBsnTlvInternalMacVer14.Builder();
    }
    public OFBsnTlvInternalMac internalMac(MacAddress value) {
        return new OFBsnTlvInternalMacVer14(
                value
                    );
    }

    public OFBsnTlvIpv4.Builder buildIpv4() {
        return new OFBsnTlvIpv4Ver14.Builder();
    }
    public OFBsnTlvIpv4 ipv4(IPv4Address value) {
        return new OFBsnTlvIpv4Ver14(
                value
                    );
    }

    public OFBsnTlvIpv4Dst.Builder buildIpv4Dst() {
        return new OFBsnTlvIpv4DstVer14.Builder();
    }
    public OFBsnTlvIpv4Dst ipv4Dst(IPv4Address value) {
        return new OFBsnTlvIpv4DstVer14(
                value
                    );
    }

    public OFBsnTlvIpv4Src.Builder buildIpv4Src() {
        return new OFBsnTlvIpv4SrcVer14.Builder();
    }
    public OFBsnTlvIpv4Src ipv4Src(IPv4Address value) {
        return new OFBsnTlvIpv4SrcVer14(
                value
                    );
    }

    public OFBsnTlvMac.Builder buildMac() {
        return new OFBsnTlvMacVer14.Builder();
    }
    public OFBsnTlvMac mac(MacAddress value) {
        return new OFBsnTlvMacVer14(
                value
                    );
    }

    public OFBsnTlvMacMask.Builder buildMacMask() {
        return new OFBsnTlvMacMaskVer14.Builder();
    }
    public OFBsnTlvMacMask macMask(MacAddress value) {
        return new OFBsnTlvMacMaskVer14(
                value
                    );
    }

    public OFBsnTlvMissPackets.Builder buildMissPackets() {
        return new OFBsnTlvMissPacketsVer14.Builder();
    }
    public OFBsnTlvMissPackets missPackets(U64 value) {
        return new OFBsnTlvMissPacketsVer14(
                value
                    );
    }

    public OFBsnTlvName.Builder buildName() {
        return new OFBsnTlvNameVer14.Builder();
    }
    public OFBsnTlvName name(byte[] value) {
        return new OFBsnTlvNameVer14(
                value
                    );
    }

    public OFBsnTlvPartnerKey.Builder buildPartnerKey() {
        return new OFBsnTlvPartnerKeyVer14.Builder();
    }
    public OFBsnTlvPartnerKey partnerKey(int value) {
        return new OFBsnTlvPartnerKeyVer14(
                value
                    );
    }

    public OFBsnTlvPartnerPortNum.Builder buildPartnerPortNum() {
        return new OFBsnTlvPartnerPortNumVer14.Builder();
    }
    public OFBsnTlvPartnerPortNum partnerPortNum(int value) {
        return new OFBsnTlvPartnerPortNumVer14(
                value
                    );
    }

    public OFBsnTlvPartnerPortPriority.Builder buildPartnerPortPriority() {
        return new OFBsnTlvPartnerPortPriorityVer14.Builder();
    }
    public OFBsnTlvPartnerPortPriority partnerPortPriority(int value) {
        return new OFBsnTlvPartnerPortPriorityVer14(
                value
                    );
    }

    public OFBsnTlvPartnerState.Builder buildPartnerState() {
        return new OFBsnTlvPartnerStateVer14.Builder();
    }
    public OFBsnTlvPartnerState partnerState(Set<OFBsnLacpState> value) {
        return new OFBsnTlvPartnerStateVer14(
                value
                    );
    }

    public OFBsnTlvPartnerSystemMac.Builder buildPartnerSystemMac() {
        return new OFBsnTlvPartnerSystemMacVer14.Builder();
    }
    public OFBsnTlvPartnerSystemMac partnerSystemMac(MacAddress value) {
        return new OFBsnTlvPartnerSystemMacVer14(
                value
                    );
    }

    public OFBsnTlvPartnerSystemPriority.Builder buildPartnerSystemPriority() {
        return new OFBsnTlvPartnerSystemPriorityVer14.Builder();
    }
    public OFBsnTlvPartnerSystemPriority partnerSystemPriority(int value) {
        return new OFBsnTlvPartnerSystemPriorityVer14(
                value
                    );
    }

    public OFBsnTlvPort.Builder buildPort() {
        return new OFBsnTlvPortVer14.Builder();
    }
    public OFBsnTlvPort port(OFPort value) {
        return new OFBsnTlvPortVer14(
                value
                    );
    }

    public OFBsnTlvPriority.Builder buildPriority() {
        return new OFBsnTlvPriorityVer14.Builder();
    }
    public OFBsnTlvPriority priority(long value) {
        return new OFBsnTlvPriorityVer14(
                value
                    );
    }

    public OFBsnTlvQueueId.Builder buildQueueId() {
        return new OFBsnTlvQueueIdVer14.Builder();
    }
    public OFBsnTlvQueueId queueId(long value) {
        return new OFBsnTlvQueueIdVer14(
                value
                    );
    }

    public OFBsnTlvQueueWeight.Builder buildQueueWeight() {
        return new OFBsnTlvQueueWeightVer14.Builder();
    }
    public OFBsnTlvQueueWeight queueWeight(long value) {
        return new OFBsnTlvQueueWeightVer14(
                value
                    );
    }

    public OFBsnTlvReplyPackets.Builder buildReplyPackets() {
        return new OFBsnTlvReplyPacketsVer14.Builder();
    }
    public OFBsnTlvReplyPackets replyPackets(U64 value) {
        return new OFBsnTlvReplyPacketsVer14(
                value
                    );
    }

    public OFBsnTlvRequestPackets.Builder buildRequestPackets() {
        return new OFBsnTlvRequestPacketsVer14.Builder();
    }
    public OFBsnTlvRequestPackets requestPackets(U64 value) {
        return new OFBsnTlvRequestPacketsVer14(
                value
                    );
    }

    public OFBsnTlvRxPackets.Builder buildRxPackets() {
        return new OFBsnTlvRxPacketsVer14.Builder();
    }
    public OFBsnTlvRxPackets rxPackets(U64 value) {
        return new OFBsnTlvRxPacketsVer14(
                value
                    );
    }

    public OFBsnTlvSamplingRate.Builder buildSamplingRate() {
        return new OFBsnTlvSamplingRateVer14.Builder();
    }
    public OFBsnTlvSamplingRate samplingRate(long value) {
        return new OFBsnTlvSamplingRateVer14(
                value
                    );
    }

    public OFBsnTlvSubAgentId.Builder buildSubAgentId() {
        return new OFBsnTlvSubAgentIdVer14.Builder();
    }
    public OFBsnTlvSubAgentId subAgentId(long value) {
        return new OFBsnTlvSubAgentIdVer14(
                value
                    );
    }

    public OFBsnTlvTxBytes.Builder buildTxBytes() {
        return new OFBsnTlvTxBytesVer14.Builder();
    }
    public OFBsnTlvTxBytes txBytes(U64 value) {
        return new OFBsnTlvTxBytesVer14(
                value
                    );
    }

    public OFBsnTlvTxPackets.Builder buildTxPackets() {
        return new OFBsnTlvTxPacketsVer14.Builder();
    }
    public OFBsnTlvTxPackets txPackets(U64 value) {
        return new OFBsnTlvTxPacketsVer14(
                value
                    );
    }

    public OFBsnTlvUdfAnchor.Builder buildUdfAnchor() {
        return new OFBsnTlvUdfAnchorVer14.Builder();
    }
    public OFBsnTlvUdfAnchor udfAnchor(OFBsnUdfAnchor value) {
        return new OFBsnTlvUdfAnchorVer14(
                value
                    );
    }

    public OFBsnTlvUdfId.Builder buildUdfId() {
        return new OFBsnTlvUdfIdVer14.Builder();
    }
    public OFBsnTlvUdfId udfId(int value) {
        return new OFBsnTlvUdfIdVer14(
                value
                    );
    }

    public OFBsnTlvUdfLength.Builder buildUdfLength() {
        return new OFBsnTlvUdfLengthVer14.Builder();
    }
    public OFBsnTlvUdfLength udfLength(int value) {
        return new OFBsnTlvUdfLengthVer14(
                value
                    );
    }

    public OFBsnTlvUdfOffset.Builder buildUdfOffset() {
        return new OFBsnTlvUdfOffsetVer14.Builder();
    }
    public OFBsnTlvUdfOffset udfOffset(int value) {
        return new OFBsnTlvUdfOffsetVer14(
                value
                    );
    }

    public OFBsnTlvUdpDst.Builder buildUdpDst() {
        return new OFBsnTlvUdpDstVer14.Builder();
    }
    public OFBsnTlvUdpDst udpDst(int value) {
        return new OFBsnTlvUdpDstVer14(
                value
                    );
    }

    public OFBsnTlvUdpSrc.Builder buildUdpSrc() {
        return new OFBsnTlvUdpSrcVer14.Builder();
    }
    public OFBsnTlvUdpSrc udpSrc(int value) {
        return new OFBsnTlvUdpSrcVer14(
                value
                    );
    }

    public OFBsnTlvUnicastQueryTimeout.Builder buildUnicastQueryTimeout() {
        return new OFBsnTlvUnicastQueryTimeoutVer14.Builder();
    }
    public OFBsnTlvUnicastQueryTimeout unicastQueryTimeout(long value) {
        return new OFBsnTlvUnicastQueryTimeoutVer14(
                value
                    );
    }

    public OFBsnTlvVlanVid.Builder buildVlanVid() {
        return new OFBsnTlvVlanVidVer14.Builder();
    }
    public OFBsnTlvVlanVid vlanVid(VlanVid value) {
        return new OFBsnTlvVlanVidVer14(
                value
                    );
    }

    public OFBsnTlvVrf.Builder buildVrf() {
        return new OFBsnTlvVrfVer14.Builder();
    }
    public OFBsnTlvVrf vrf(long value) {
        return new OFBsnTlvVrfVer14(
                value
                    );
    }

    public OFMessageReader<OFBsnTlv> getReader() {
        return OFBsnTlvVer14.READER;
    }


    public OFVersion getVersion() {
            return OFVersion.OF_14;
    }
}