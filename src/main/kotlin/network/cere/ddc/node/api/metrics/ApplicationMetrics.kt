package network.cere.ddc.node.api.metrics

data class ApplicationMetrics(
    val appPubKey: String,
    val partitionId: String,
    val bytes: Long,
    val requests: Long
)
