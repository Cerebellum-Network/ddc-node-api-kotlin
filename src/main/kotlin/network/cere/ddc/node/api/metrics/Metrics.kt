package network.cere.ddc.node.api.metrics

import network.cere.ddc.node.api.DdcNodeApiResponse

interface Metrics {
    fun getMetrics(request: GetMetricsRequest) : DdcNodeApiResponse<List<ApplicationMetrics>>
}
