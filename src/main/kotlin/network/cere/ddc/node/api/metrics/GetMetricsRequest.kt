package network.cere.ddc.node.api.metrics

import java.time.Instant

data class GetMetricsRequest(
    val nodeAddress: String,
    val appPubKey: String? = null,
    val partitionId: String? = null,
    val from: Instant? = null,
    val to: Instant? = null
)
