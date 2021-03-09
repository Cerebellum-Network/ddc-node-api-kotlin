package network.cere.ddc.node.api.pieces

import network.cere.ddc.node.api.DdcNodeApiResponse

interface Pieces {
    fun save(request: SavePieceRequest) : DdcNodeApiResponse<PieceMetadata>

    fun getByKeys(appPubKey: String, userPubKey: String? = null) : DdcNodeApiResponse<List<Piece>>
}
