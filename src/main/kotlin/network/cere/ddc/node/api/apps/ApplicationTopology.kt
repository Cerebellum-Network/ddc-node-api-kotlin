package network.cere.ddc.node.api.apps

data class ApplicationTopology(
    val appPubKey: String,
    val partitions: List<ApplicationPartition>
)
