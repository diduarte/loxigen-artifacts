// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_virtual_class.java
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
import io.netty.buffer.ByteBuf;
import java.util.Set;

abstract class OFBsnTlvVer14 {
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int MINIMUM_LENGTH = 4;


    public final static OFBsnTlvVer14.Reader READER = new Reader();

    static class Reader implements OFMessageReader<OFBsnTlv> {
        @Override
        public OFBsnTlv readFrom(ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
            short type = bb.readShort();
            bb.readerIndex(start);
            switch(type) {
               case (short) 0x2c:
                   // discriminator value 0x2c=0x2c for class OFBsnTlvActorKeyVer14
                   return OFBsnTlvActorKeyVer14.READER.readFrom(bb);
               case (short) 0x2b:
                   // discriminator value 0x2b=0x2b for class OFBsnTlvActorPortNumVer14
                   return OFBsnTlvActorPortNumVer14.READER.readFrom(bb);
               case (short) 0x2a:
                   // discriminator value 0x2a=0x2a for class OFBsnTlvActorPortPriorityVer14
                   return OFBsnTlvActorPortPriorityVer14.READER.readFrom(bb);
               case (short) 0x35:
                   // discriminator value 0x35=0x35 for class OFBsnTlvActorStateVer14
                   return OFBsnTlvActorStateVer14.READER.readFrom(bb);
               case (short) 0x29:
                   // discriminator value 0x29=0x29 for class OFBsnTlvActorSystemMacVer14
                   return OFBsnTlvActorSystemMacVer14.READER.readFrom(bb);
               case (short) 0x28:
                   // discriminator value 0x28=0x28 for class OFBsnTlvActorSystemPriorityVer14
                   return OFBsnTlvActorSystemPriorityVer14.READER.readFrom(bb);
               case (short) 0x51:
                   // discriminator value 0x51=0x51 for class OFBsnTlvAnchorVer14
                   return OFBsnTlvAnchorVer14.READER.readFrom(bb);
               case (short) 0xa:
                   // discriminator value 0xa=0xa for class OFBsnTlvBroadcastQueryTimeoutVer14
                   return OFBsnTlvBroadcastQueryTimeoutVer14.READER.readFrom(bb);
               case (short) 0x5a:
                   // discriminator value 0x5a=0x5a for class OFBsnTlvBroadcastRateVer14
                   return OFBsnTlvBroadcastRateVer14.READER.readFrom(bb);
               case (short) 0x40:
                   // discriminator value 0x40=0x40 for class OFBsnTlvBucketVer14
                   return OFBsnTlvBucketVer14.READER.readFrom(bb);
               case (short) 0xe:
                   // discriminator value 0xe=0xe for class OFBsnTlvCircuitIdVer14
                   return OFBsnTlvCircuitIdVer14.READER.readFrom(bb);
               case (short) 0x2d:
                   // discriminator value 0x2d=0x2d for class OFBsnTlvConvergenceStatusVer14
                   return OFBsnTlvConvergenceStatusVer14.READER.readFrom(bb);
               case (short) 0x16:
                   // discriminator value 0x16=0x16 for class OFBsnTlvCrcEnabledVer14
                   return OFBsnTlvCrcEnabledVer14.READER.readFrom(bb);
               case (short) 0x37:
                   // discriminator value 0x37=0x37 for class OFBsnTlvDataVer14
                   return OFBsnTlvDataVer14.READER.readFrom(bb);
               case (short) 0x55:
                   // discriminator value 0x55=0x55 for class OFBsnTlvDecapVer14
                   return OFBsnTlvDecapVer14.READER.readFrom(bb);
               case (short) 0x21:
                   // discriminator value 0x21=0x21 for class OFBsnTlvEthDstVer14
                   return OFBsnTlvEthDstVer14.READER.readFrom(bb);
               case (short) 0x20:
                   // discriminator value 0x20=0x20 for class OFBsnTlvEthSrcVer14
                   return OFBsnTlvEthSrcVer14.READER.readFrom(bb);
               case (short) 0x1a:
                   // discriminator value 0x1a=0x1a for class OFBsnTlvExternalGatewayIpVer14
                   return OFBsnTlvExternalGatewayIpVer14.READER.readFrom(bb);
               case (short) 0x1d:
                   // discriminator value 0x1d=0x1d for class OFBsnTlvExternalGatewayMacVer14
                   return OFBsnTlvExternalGatewayMacVer14.READER.readFrom(bb);
               case (short) 0x17:
                   // discriminator value 0x17=0x17 for class OFBsnTlvExternalIpVer14
                   return OFBsnTlvExternalIpVer14.READER.readFrom(bb);
               case (short) 0x18:
                   // discriminator value 0x18=0x18 for class OFBsnTlvExternalMacVer14
                   return OFBsnTlvExternalMacVer14.READER.readFrom(bb);
               case (short) 0x19:
                   // discriminator value 0x19=0x19 for class OFBsnTlvExternalNetmaskVer14
                   return OFBsnTlvExternalNetmaskVer14.READER.readFrom(bb);
               case (short) 0x50:
                   // discriminator value 0x50=0x50 for class OFBsnTlvGenerationIdVer14
                   return OFBsnTlvGenerationIdVer14.READER.readFrom(bb);
               case (short) 0x1f:
                   // discriminator value 0x1f=0x1f for class OFBsnTlvHeaderSizeVer14
                   return OFBsnTlvHeaderSizeVer14.READER.readFrom(bb);
               case (short) 0x45:
                   // discriminator value 0x45=0x45 for class OFBsnTlvIcmpCodeVer14
                   return OFBsnTlvIcmpCodeVer14.READER.readFrom(bb);
               case (short) 0x46:
                   // discriminator value 0x46=0x46 for class OFBsnTlvIcmpIdVer14
                   return OFBsnTlvIcmpIdVer14.READER.readFrom(bb);
               case (short) 0x44:
                   // discriminator value 0x44=0x44 for class OFBsnTlvIcmpTypeVer14
                   return OFBsnTlvIcmpTypeVer14.READER.readFrom(bb);
               case (short) 0x7:
                   // discriminator value 0x7=0x7 for class OFBsnTlvIdleNotificationVer14
                   return OFBsnTlvIdleNotificationVer14.READER.readFrom(bb);
               case (short) 0x5:
                   // discriminator value 0x5=0x5 for class OFBsnTlvIdleTimeVer14
                   return OFBsnTlvIdleTimeVer14.READER.readFrom(bb);
               case (short) 0x8:
                   // discriminator value 0x8=0x8 for class OFBsnTlvIdleTimeoutVer14
                   return OFBsnTlvIdleTimeoutVer14.READER.readFrom(bb);
               case (short) 0x4e:
                   // discriminator value 0x4e=0x4e for class OFBsnTlvIgmpSnoopingVer14
                   return OFBsnTlvIgmpSnoopingVer14.READER.readFrom(bb);
               case (short) 0x1c:
                   // discriminator value 0x1c=0x1c for class OFBsnTlvInternalGatewayMacVer14
                   return OFBsnTlvInternalGatewayMacVer14.READER.readFrom(bb);
               case (short) 0x1b:
                   // discriminator value 0x1b=0x1b for class OFBsnTlvInternalMacVer14
                   return OFBsnTlvInternalMacVer14.READER.readFrom(bb);
               case (short) 0x3a:
                   // discriminator value 0x3a=0x3a for class OFBsnTlvIntervalVer14
                   return OFBsnTlvIntervalVer14.READER.readFrom(bb);
               case (short) 0x43:
                   // discriminator value 0x43=0x43 for class OFBsnTlvIpProtoVer14
                   return OFBsnTlvIpProtoVer14.READER.readFrom(bb);
               case (short) 0x4:
                   // discriminator value 0x4=0x4 for class OFBsnTlvIpv4Ver14
                   return OFBsnTlvIpv4Ver14.READER.readFrom(bb);
               case (short) 0x23:
                   // discriminator value 0x23=0x23 for class OFBsnTlvIpv4DstVer14
                   return OFBsnTlvIpv4DstVer14.READER.readFrom(bb);
               case (short) 0x3c:
                   // discriminator value 0x3c=0x3c for class OFBsnTlvIpv4NetmaskVer14
                   return OFBsnTlvIpv4NetmaskVer14.READER.readFrom(bb);
               case (short) 0x22:
                   // discriminator value 0x22=0x22 for class OFBsnTlvIpv4SrcVer14
                   return OFBsnTlvIpv4SrcVer14.READER.readFrom(bb);
               case (short) 0x54:
                   // discriminator value 0x54=0x54 for class OFBsnTlvIpv6Ver14
                   return OFBsnTlvIpv6Ver14.READER.readFrom(bb);
               case (short) 0x5b:
                   // discriminator value 0x5b=0x5b for class OFBsnTlvKnownMulticastRateVer14
                   return OFBsnTlvKnownMulticastRateVer14.READER.readFrom(bb);
               case (short) 0x4f:
                   // discriminator value 0x4f=0x4f for class OFBsnTlvL2MulticastLookupVer14
                   return OFBsnTlvL2MulticastLookupVer14.READER.readFrom(bb);
               case (short) 0x1:
                   // discriminator value 0x1=0x1 for class OFBsnTlvMacVer14
                   return OFBsnTlvMacVer14.READER.readFrom(bb);
               case (short) 0x38:
                   // discriminator value 0x38=0x38 for class OFBsnTlvMacMaskVer14
                   return OFBsnTlvMacMaskVer14.READER.readFrom(bb);
               case (short) 0x57:
                   // discriminator value 0x57=0x57 for class OFBsnTlvMcgTypeVxlanVer14
                   return OFBsnTlvMcgTypeVxlanVer14.READER.readFrom(bb);
               case (short) 0xd:
                   // discriminator value 0xd=0xd for class OFBsnTlvMissPacketsVer14
                   return OFBsnTlvMissPacketsVer14.READER.readFrom(bb);
               case (short) 0x3e:
                   // discriminator value 0x3e=0x3e for class OFBsnTlvMplsControlWordVer14
                   return OFBsnTlvMplsControlWordVer14.READER.readFrom(bb);
               case (short) 0x3d:
                   // discriminator value 0x3d=0x3d for class OFBsnTlvMplsLabelVer14
                   return OFBsnTlvMplsLabelVer14.READER.readFrom(bb);
               case (short) 0x3f:
                   // discriminator value 0x3f=0x3f for class OFBsnTlvMplsSequencedVer14
                   return OFBsnTlvMplsSequencedVer14.READER.readFrom(bb);
               case (short) 0x5f:
                   // discriminator value 0x5f=0x5f for class OFBsnTlvMulticastInterfaceIdVer14
                   return OFBsnTlvMulticastInterfaceIdVer14.READER.readFrom(bb);
               case (short) 0x34:
                   // discriminator value 0x34=0x34 for class OFBsnTlvNameVer14
                   return OFBsnTlvNameVer14.READER.readFrom(bb);
               case (short) 0x53:
                   // discriminator value 0x53=0x53 for class OFBsnTlvNegateVer14
                   return OFBsnTlvNegateVer14.READER.readFrom(bb);
               case (short) 0x5e:
                   // discriminator value 0x5e=0x5e for class OFBsnTlvNexthopTypeVxlanVer14
                   return OFBsnTlvNexthopTypeVxlanVer14.READER.readFrom(bb);
               case (short) 0x52:
                   // discriminator value 0x52=0x52 for class OFBsnTlvOffsetVer14
                   return OFBsnTlvOffsetVer14.READER.readFrom(bb);
               case (short) 0x33:
                   // discriminator value 0x33=0x33 for class OFBsnTlvPartnerKeyVer14
                   return OFBsnTlvPartnerKeyVer14.READER.readFrom(bb);
               case (short) 0x32:
                   // discriminator value 0x32=0x32 for class OFBsnTlvPartnerPortNumVer14
                   return OFBsnTlvPartnerPortNumVer14.READER.readFrom(bb);
               case (short) 0x31:
                   // discriminator value 0x31=0x31 for class OFBsnTlvPartnerPortPriorityVer14
                   return OFBsnTlvPartnerPortPriorityVer14.READER.readFrom(bb);
               case (short) 0x36:
                   // discriminator value 0x36=0x36 for class OFBsnTlvPartnerStateVer14
                   return OFBsnTlvPartnerStateVer14.READER.readFrom(bb);
               case (short) 0x30:
                   // discriminator value 0x30=0x30 for class OFBsnTlvPartnerSystemMacVer14
                   return OFBsnTlvPartnerSystemMacVer14.READER.readFrom(bb);
               case (short) 0x2f:
                   // discriminator value 0x2f=0x2f for class OFBsnTlvPartnerSystemPriorityVer14
                   return OFBsnTlvPartnerSystemPriorityVer14.READER.readFrom(bb);
               case (short) 0x0:
                   // discriminator value 0x0=0x0 for class OFBsnTlvPortVer14
                   return OFBsnTlvPortVer14.READER.readFrom(bb);
               case (short) 0x58:
                   // discriminator value 0x58=0x58 for class OFBsnTlvPortVxlanModeVer14
                   return OFBsnTlvPortVxlanModeVer14.READER.readFrom(bb);
               case (short) 0x39:
                   // discriminator value 0x39=0x39 for class OFBsnTlvPriorityVer14
                   return OFBsnTlvPriorityVer14.READER.readFrom(bb);
               case (short) 0x14:
                   // discriminator value 0x14=0x14 for class OFBsnTlvQueueIdVer14
                   return OFBsnTlvQueueIdVer14.READER.readFrom(bb);
               case (short) 0x15:
                   // discriminator value 0x15=0x15 for class OFBsnTlvQueueWeightVer14
                   return OFBsnTlvQueueWeightVer14.READER.readFrom(bb);
               case (short) 0x59:
                   // discriminator value 0x59=0x59 for class OFBsnTlvRateUnitVer14
                   return OFBsnTlvRateUnitVer14.READER.readFrom(bb);
               case (short) 0x3b:
                   // discriminator value 0x3b=0x3b for class OFBsnTlvReferenceVer14
                   return OFBsnTlvReferenceVer14.READER.readFrom(bb);
               case (short) 0xc:
                   // discriminator value 0xc=0xc for class OFBsnTlvReplyPacketsVer14
                   return OFBsnTlvReplyPacketsVer14.READER.readFrom(bb);
               case (short) 0xb:
                   // discriminator value 0xb=0xb for class OFBsnTlvRequestPacketsVer14
                   return OFBsnTlvRequestPacketsVer14.READER.readFrom(bb);
               case (short) 0x47:
                   // discriminator value 0x47=0x47 for class OFBsnTlvRxBytesVer14
                   return OFBsnTlvRxBytesVer14.READER.readFrom(bb);
               case (short) 0x2:
                   // discriminator value 0x2=0x2 for class OFBsnTlvRxPacketsVer14
                   return OFBsnTlvRxPacketsVer14.READER.readFrom(bb);
               case (short) 0x1e:
                   // discriminator value 0x1e=0x1e for class OFBsnTlvSamplingRateVer14
                   return OFBsnTlvSamplingRateVer14.READER.readFrom(bb);
               case (short) 0x4a:
                   // discriminator value 0x4a=0x4a for class OFBsnTlvSetLoopbackModeVer14
                   return OFBsnTlvSetLoopbackModeVer14.READER.readFrom(bb);
               case (short) 0x4b:
                   // discriminator value 0x4b=0x4b for class OFBsnTlvStripMplsL2OnIngressVer14
                   return OFBsnTlvStripMplsL2OnIngressVer14.READER.readFrom(bb);
               case (short) 0x4c:
                   // discriminator value 0x4c=0x4c for class OFBsnTlvStripMplsL3OnIngressVer14
                   return OFBsnTlvStripMplsL3OnIngressVer14.READER.readFrom(bb);
               case (short) 0x49:
                   // discriminator value 0x49=0x49 for class OFBsnTlvStripVlanOnEgressVer14
                   return OFBsnTlvStripVlanOnEgressVer14.READER.readFrom(bb);
               case (short) 0x26:
                   // discriminator value 0x26=0x26 for class OFBsnTlvSubAgentIdVer14
                   return OFBsnTlvSubAgentIdVer14.READER.readFrom(bb);
               case (short) 0x42:
                   // discriminator value 0x42=0x42 for class OFBsnTlvTcpDstVer14
                   return OFBsnTlvTcpDstVer14.READER.readFrom(bb);
               case (short) 0x41:
                   // discriminator value 0x41=0x41 for class OFBsnTlvTcpSrcVer14
                   return OFBsnTlvTcpSrcVer14.READER.readFrom(bb);
               case (short) 0x27:
                   // discriminator value 0x27=0x27 for class OFBsnTlvTxBytesVer14
                   return OFBsnTlvTxBytesVer14.READER.readFrom(bb);
               case (short) 0x3:
                   // discriminator value 0x3=0x3 for class OFBsnTlvTxPacketsVer14
                   return OFBsnTlvTxPacketsVer14.READER.readFrom(bb);
               case (short) 0x10:
                   // discriminator value 0x10=0x10 for class OFBsnTlvUdfAnchorVer14
                   return OFBsnTlvUdfAnchorVer14.READER.readFrom(bb);
               case (short) 0xf:
                   // discriminator value 0xf=0xf for class OFBsnTlvUdfIdVer14
                   return OFBsnTlvUdfIdVer14.READER.readFrom(bb);
               case (short) 0x12:
                   // discriminator value 0x12=0x12 for class OFBsnTlvUdfLengthVer14
                   return OFBsnTlvUdfLengthVer14.READER.readFrom(bb);
               case (short) 0x11:
                   // discriminator value 0x11=0x11 for class OFBsnTlvUdfOffsetVer14
                   return OFBsnTlvUdfOffsetVer14.READER.readFrom(bb);
               case (short) 0x25:
                   // discriminator value 0x25=0x25 for class OFBsnTlvUdpDstVer14
                   return OFBsnTlvUdpDstVer14.READER.readFrom(bb);
               case (short) 0x24:
                   // discriminator value 0x24=0x24 for class OFBsnTlvUdpSrcVer14
                   return OFBsnTlvUdpSrcVer14.READER.readFrom(bb);
               case (short) 0x9:
                   // discriminator value 0x9=0x9 for class OFBsnTlvUnicastQueryTimeoutVer14
                   return OFBsnTlvUnicastQueryTimeoutVer14.READER.readFrom(bb);
               case (short) 0x5d:
                   // discriminator value 0x5d=0x5d for class OFBsnTlvUnicastRateVer14
                   return OFBsnTlvUnicastRateVer14.READER.readFrom(bb);
               case (short) 0x5c:
                   // discriminator value 0x5c=0x5c for class OFBsnTlvUnknownMulticastRateVer14
                   return OFBsnTlvUnknownMulticastRateVer14.READER.readFrom(bb);
               case (short) 0x48:
                   // discriminator value 0x48=0x48 for class OFBsnTlvVlanPcpVer14
                   return OFBsnTlvVlanPcpVer14.READER.readFrom(bb);
               case (short) 0x6:
                   // discriminator value 0x6=0x6 for class OFBsnTlvVlanVidVer14
                   return OFBsnTlvVlanVidVer14.READER.readFrom(bb);
               case (short) 0x4d:
                   // discriminator value 0x4d=0x4d for class OFBsnTlvVlanVidMaskVer14
                   return OFBsnTlvVlanVidMaskVer14.READER.readFrom(bb);
               case (short) 0x56:
                   // discriminator value 0x56=0x56 for class OFBsnTlvVniVer14
                   return OFBsnTlvVniVer14.READER.readFrom(bb);
               case (short) 0x13:
                   // discriminator value 0x13=0x13 for class OFBsnTlvVrfVer14
                   return OFBsnTlvVrfVer14.READER.readFrom(bb);
               default:
                   throw new OFParseError("Unknown value for discriminator type of class OFBsnTlvVer14: " + type);
            }
        }
    }
}
