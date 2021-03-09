package network.cere.ddc.node.api.metadata

data class NetworkCapacity(
    val nodesCount: Int,
    val totalPartitions: Int,
    val reservedPartitions: Int,
    val availablePartitions: Int,
)
