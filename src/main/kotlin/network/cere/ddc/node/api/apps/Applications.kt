package network.cere.ddc.node.api.apps

import network.cere.ddc.node.api.DdcNodeApiResponse

interface Applications {
    fun create(request: CreateApplicationRequest) : DdcNodeApiResponse<Unit>

    fun get(appPubKey: String): DdcNodeApiResponse<Application>

    fun getTopology(appPubKey: String) : DdcNodeApiResponse<ApplicationTopology>
}
