package com.loc.newsapp.presentation.common

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.paging.LoadState
import androidx.paging.compose.LazyPagingItems
import com.loc.newsapp.domain.model.Article

fun ArticlesList(
    modifier: Modifier = Modifier,
    articles :LazyPagingItems<Article>,
    onClick:(Article)->Unit
){
}


@Composable
fun handlePagingResult(
    articles :LazyPagingItems<Article>
):Boolean {
    val loadState = articles.loadState
    val error = when{
        loadState.refresh is LoadState.Error -> loadState.refresh as LoadState.Error
        loadState.prepend is LoadState.Error -> loadState.prepend as LoadState.Error
        loadState.append is LoadState.Error -> loadState.append as LoadState.Error
        else -> null
    }
    return when{
        loadState.refresh is LoadState.Loading->{

        }
    }

}

@Composable
private fun ShimmerEffect(){

}