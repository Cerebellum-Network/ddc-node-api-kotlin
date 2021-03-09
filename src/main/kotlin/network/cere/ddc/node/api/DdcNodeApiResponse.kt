package network.cere.ddc.node.api

data class DdcNodeApiResponse<T>(
    val statusCode: Int,
    val statusMessage: String,
    val body: T?
)
