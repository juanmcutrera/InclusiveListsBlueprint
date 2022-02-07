package com.bitropia.inclusivelistsblueprint.data.mappers

import com.bitropia.inclusivelistsblueprint.domain.entities.ListHeader
import com.bitropia.inclusivelistsblueprint.data.db.ListHeader as DomainListHeader


fun ListHeader.toRoomListHeader(): DomainListHeader =
    (
        DomainListHeader(this.Id, this.Description )
    )

fun DomainListHeader.toDomainListHeader(): ListHeader = ListHeader(
    Id,
    Description
)
