package network.cere.ddc.node.api.apps

data class ApplicationPartition(
    val partitionId: String,
    val ringToken: Long,
    val master: ApplicationPartitionNodeMetadata,
    val replicas: List<ApplicationPartitionNodeMetadata>
)
