package br.com.map.topiteste.data.repositories

import br.com.map.topiteste.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}