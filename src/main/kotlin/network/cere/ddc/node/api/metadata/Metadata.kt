package network.cere.ddc.node.api.metadata

import network.cere.ddc.node.api.DdcNodeApiResponse

interface Metadata {
    fun getPartitions(): DdcNodeApiResponse<List<NodePartition>>

    fun getNodes(): DdcNodeApiResponse<List<NodeMetadata>>

    fun getNetworkCapacity(): DdcNodeApiResponse<NetworkCapacity>
}
