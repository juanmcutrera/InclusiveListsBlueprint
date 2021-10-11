package com.bitropia.inclusivelistsblueprint.data.mappers

import  com.bitropia.inclusivelistsblueprint.domain.entities.ListHeader
import com.bitropia.inclusivelistsblueprint.data.entities.ListHeaderEntity


class ListHeaderEntityMapper {
    fun toListHeaderEntity(listheader: ListHeader): ListHeaderEntity {
        return ListHeaderEntity(
            Id = listheader.Id,
            Description = listheader.Description,
            Price = listheader.Price,
            Quantity =  listheader.Quantity,
            IdDesc =  listheader.IdDesc
        )
    }

    fun toListHeader(listheaderEntity: ListHeaderEntity): ListHeader {
        return ListHeader(
            listheaderEntity.Id,listheaderEntity.Description,
            listheaderEntity.Price, listheaderEntity.Quantity,
            listheaderEntity.IdDesc)

    }

}