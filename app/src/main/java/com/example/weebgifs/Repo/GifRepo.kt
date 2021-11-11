package com.example.weebgifs.Repo

import com.example.weebgifs.Repo.remote.RetrofitInstance
import com.example.weebgifs.model.GifList
import retrofit2.Response

object GifRepo {

    suspend fun getBite(): Response<GifList>{
        return RetrofitInstance.gifService.getBite(20)
    }
    suspend fun getBaka(): Response<GifList>{
        return RetrofitInstance.gifService.getBaka(20)
    }
    suspend fun getBlush(): Response<GifList>{
        return RetrofitInstance.gifService.getBlush(20)
    }
    suspend fun getBored(): Response<GifList>{
        return RetrofitInstance.gifService.getBored(20)
    }
    suspend fun getCry(): Response<GifList>{
        return RetrofitInstance.gifService.getCry(20)
    }
    suspend fun getCuddle(): Response<GifList>{
        return RetrofitInstance.gifService.getCuddle(20)
    }
    suspend fun getDance(): Response<GifList>{
        return RetrofitInstance.gifService.getDance(20)
    }
    suspend fun getFacepalm(): Response<GifList>{
        return RetrofitInstance.gifService.getFacepalm(20)
    }
    suspend fun getFeed(): Response<GifList>{
        return RetrofitInstance.gifService.getFeed(20)
    }
    suspend fun getHappy(): Response<GifList>{
        return RetrofitInstance.gifService.getHappy(20)
    }
    suspend fun getHighFive(): Response<GifList>{
        return RetrofitInstance.gifService.getHighfive(20)
    }
    suspend fun getHug(): Response<GifList>{
        return RetrofitInstance.gifService.getHug(20)
    }
    suspend fun getKiss(): Response<GifList>{
        return RetrofitInstance.gifService.getKiss(20)
    }
    suspend fun getLaugh(): Response<GifList>{
        return RetrofitInstance.gifService.getLaugh(20)
    }
    suspend fun getPat(): Response<GifList>{
        return RetrofitInstance.gifService.getPat(20)
    }
    suspend fun getPoke(): Response<GifList>{
        return RetrofitInstance.gifService.getPoke(20)
    }
    suspend fun getPout(): Response<GifList>{
        return RetrofitInstance.gifService.getPout(20)
    }
    suspend fun getShrug(): Response<GifList>{
        return RetrofitInstance.gifService.getShrug(20)
    }
    suspend fun getSlap(): Response<GifList>{
        return RetrofitInstance.gifService.getSlap(20)
    }
    suspend fun getSleep(): Response<GifList>{
        return RetrofitInstance.gifService.getSleep(20)
    }
    suspend fun getSmile(): Response<GifList>{
        return RetrofitInstance.gifService.getSmile(20)
    }
    suspend fun getSmug(): Response<GifList>{
        return RetrofitInstance.gifService.getSmug(20)
    }
    suspend fun getStare(): Response<GifList>{
        return RetrofitInstance.gifService.getStare(20)
    }
    suspend fun getThink(): Response<GifList>{
        return RetrofitInstance.gifService.getThink(20)
    }
    suspend fun getThumbsup(): Response<GifList>{
        return RetrofitInstance.gifService.getThumbsup(20)
    }
    suspend fun getTickle(): Response<GifList>{
        return RetrofitInstance.gifService.getTickle(20)
    }
    suspend fun getWave(): Response<GifList>{
        return RetrofitInstance.gifService.getWave(20)
    }
    suspend fun getWink(): Response<GifList>{
        return RetrofitInstance.gifService.getWink(20)
    }
}