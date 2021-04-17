package edu.uca.personality.retrofit

import edu.uca.personality.model.Personalities
import edu.uca.personality.utils.EntityMapper
import javax.inject.Inject

class NetworkMapper
@Inject
constructor() : EntityMapper<PersonalitiesEntity, Personalities> {
    override fun mapFromEntity(entity: PersonalitiesEntity): Personalities {
        return Personalities(
            id = entity.id,
            name = entity.name,
            description = entity.description,
            url = entity.url
        )
    }

    override fun mapToEntity(domainModel: Personalities): PersonalitiesEntity {
        return  PersonalitiesEntity(
            id = domainModel.id,
            name = domainModel.name,
            description = domainModel.description,
            url = domainModel.url
        )
    }

    fun mapFromEntityList(entities: List<PersonalitiesEntity>): List<Personalities>{
        return entities.map { mapFromEntity(it) }
    }
}