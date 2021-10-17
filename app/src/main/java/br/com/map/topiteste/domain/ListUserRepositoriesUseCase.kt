package br.com.map.topiteste.domain

import br.com.map.topiteste.core.UseCase
import br.com.map.topiteste.data.model.Repo
import br.com.map.topiteste.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}