package edu.uca.personality.room

import edu.uca.personality.model.Personalities
import edu.uca.personality.utils.EntityMapper
import javax.inject.Inject

class CacheMapper
@Inject
constructor():
    EntityMapper<PersonalitiesCacheEntitiy, Personalities> {

    override fun mapFromEntity(entitiy: PersonalitiesCacheEntitiy): Personalities {
        return Personalities(
            id = entitiy.id,
            name = entitiy.name,
            description = entitiy.description,
            url = entitiy.url
        )
    }

    override fun mapToEntity(domainModel: Personalities): PersonalitiesCacheEntitiy {
        return PersonalitiesCacheEntitiy(
            id = domainModel.id,
            name = domainModel.name,
            description = domainModel.description,
            url = domainModel.url,
        )
    }

    fun mapFromEntityList(entitiys: List<PersonalitiesCacheEntitiy>): List<Personalities>{
        return entitiys.map { mapFromEntity(it) }
    }
}