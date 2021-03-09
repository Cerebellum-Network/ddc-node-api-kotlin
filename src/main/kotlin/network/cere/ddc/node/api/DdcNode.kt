package network.cere.ddc.node.api

import network.cere.ddc.node.api.apps.Applications
import network.cere.ddc.node.api.metadata.Metadata
import network.cere.ddc.node.api.metrics.Metrics
import network.cere.ddc.node.api.pieces.Pieces

interface DdcNode {
    val pieces: Pieces

    val applications: Applications

    val metrics: Metrics

    val metadata: Metadata
}
