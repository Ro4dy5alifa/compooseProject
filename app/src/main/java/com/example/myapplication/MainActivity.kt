package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun GithubRepositories() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Github Repositories",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )

        RepositoryCard(
            imageResId = R.drawable.ruby_logo, // Replace with your drawable
            title = "less.js",
            description = "Less. The dynamic stylesheet language.",
            stars = 16971
        )

        RepositoryCard(
            imageResId = R.drawable.ruby_logo, // Replace with your drawable
            title = "ruby",
            description = "The Ruby Programming Language",
            stars = 20981
        )
    }
}

@Composable
fun RepositoryCard(
    imageResId: Int,
    title: String,
    description: String,
    stars: Int
) {
    Card(
        shape = RoundedCornerShape(8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(id = imageResId),
                contentDescription = "$title logo",
                contentScale = ContentScale.Fit,
                modifier = Modifier.size(50.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = title,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Text(
                    text = description,
                    fontSize = 12.sp,
                    color = Color.Gray,
                    maxLines = 1
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stars.toString(),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Icon(
                    painter = painterResource(id = R.drawable.ic_star), // Replace with your star drawable
                    contentDescription = "Star",
                    tint = Color.Yellow,
                    modifier = Modifier.size(20.dp)
                )
            }
        }
    }
}

@Preview (showBackground = true)
@Composable
fun PreviewGithubRepositories() {
    GithubRepositories()
}
