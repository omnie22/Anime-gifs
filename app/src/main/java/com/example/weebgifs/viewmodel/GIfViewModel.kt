package com.example.weebgifs.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weebgifs.Repo.GifRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import model.GifList
import retrofit2.Response

class GIfViewModel: ViewModel() {
    private val _gifs = MutableLiveData<GifList>()
    val gifs: LiveData<GifList> get() =_gifs

    fun getBite(){
        viewModelScope.launch(Dispatchers.IO) {
            val response = GifRepo.getBite()
            if (response.isSuccessful)
                _gifs.postValue(response.body())
        }
    }
    fun getBaka(){
        viewModelScope.launch(Dispatchers.IO) {
            val response = GifRepo.getBaka()
            if (response.isSuccessful)
                _gifs.postValue(response.body())
        }
    }
    fun getBlush(){
        viewModelScope.launch(Dispatchers.IO) {
            val response = GifRepo.getBlush()
            if (response.isSuccessful)
                _gifs.postValue(response.body())
        }
    }
    fun getBored(){
        viewModelScope.launch(Dispatchers.IO) {
            val response = GifRepo.getBored()
            if (response.isSuccessful)
                _gifs.postValue(response.body())
        }
    }
    fun getCry(){
        viewModelScope.launch(Dispatchers.IO) {
            val response = GifRepo.getCry()
            if (response.isSuccessful)
                _gifs.postValue(response.body())
        }
    }
    fun getCuddle(){
        viewModelScope.launch(Dispatchers.IO) {
            val response = GifRepo.getCuddle()
            if (response.isSuccessful)
                _gifs.postValue(response.body())
        }
    }
    fun getDance(){
        viewModelScope.launch(Dispatchers.IO) {
            val response = GifRepo.getDance()
            if (response.isSuccessful)
                _gifs.postValue(response.body())
        }
    }
    fun getFeed(){
        viewModelScope.launch(Dispatchers.IO) {
            val response = GifRepo.getFeed()
            if (response.isSuccessful)
                _gifs.postValue(response.body())
        }
    }
    fun getHappy(){
        viewModelScope.launch(Dispatchers.IO) {
            val response = GifRepo.getHappy()
            if (response.isSuccessful)
                _gifs.postValue(response.body())
        }
    }
    fun getHighfive(){
        viewModelScope.launch(Dispatchers.IO) {
            val response = GifRepo.getHighFive()
            if (response.isSuccessful)
                _gifs.postValue(response.body())
        }
    }
    fun getHug(){
        viewModelScope.launch(Dispatchers.IO) {
            val response = GifRepo.getHug()
            if (response.isSuccessful)
                _gifs.postValue(response.body())
        }
    }
    fun getFacepalm(){
        viewModelScope.launch(Dispatchers.IO) {
            val response = GifRepo.getFacepalm()
            if (response.isSuccessful)
                _gifs.postValue(response.body())
        }
    }
    fun getKiss(){
        viewModelScope.launch(Dispatchers.IO) {
            val response = GifRepo.getKiss()
            if (response.isSuccessful)
                _gifs.postValue(response.body())
        }
    }
    fun getLaugh(){
        viewModelScope.launch(Dispatchers.IO) {
            val response = GifRepo.getLaugh()
            if (response.isSuccessful)
                _gifs.postValue(response.body())
        }
    }
    fun getPat(){
        viewModelScope.launch(Dispatchers.IO) {
            val response = GifRepo.getPat()
            if (response.isSuccessful)
                _gifs.postValue(response.body())
        }
    }
    fun getPoke(){
        viewModelScope.launch(Dispatchers.IO) {
            val response = GifRepo.getPoke()
            if (response.isSuccessful)
                _gifs.postValue(response.body())
        }
    }
    fun getPout(){
        viewModelScope.launch(Dispatchers.IO) {
            val response = GifRepo.getPout()
            if (response.isSuccessful)
                _gifs.postValue(response.body())
        }
    }
    fun getShrug(){
        viewModelScope.launch(Dispatchers.IO) {
            val response = GifRepo.getShrug()
            if (response.isSuccessful)
                _gifs.postValue(response.body())
        }
    }
    fun getSlap(){
        viewModelScope.launch(Dispatchers.IO) {
            val response = GifRepo.getSlap()
            if (response.isSuccessful)
                _gifs.postValue(response.body())
        }
    }
    fun getSleep(){
        viewModelScope.launch(Dispatchers.IO) {
            val response = GifRepo.getSleep()
            if (response.isSuccessful)
                _gifs.postValue(response.body())
        }
    }
    fun getSmile(){
        viewModelScope.launch(Dispatchers.IO) {
            val response = GifRepo.getSmile()
            if (response.isSuccessful)
                _gifs.postValue(response.body())
        }
    }
    fun getSmug(){
        viewModelScope.launch(Dispatchers.IO) {
            val response = GifRepo.getSmug()
            if (response.isSuccessful)
                _gifs.postValue(response.body())
        }
    }
    fun getStare(){
        viewModelScope.launch(Dispatchers.IO) {
            val response = GifRepo.getStare()
            if (response.isSuccessful)
                _gifs.postValue(response.body())
        }
    }
    fun getThink(){
        viewModelScope.launch(Dispatchers.IO) {
            val response = GifRepo.getThink()
            if (response.isSuccessful)
                _gifs.postValue(response.body())
        }
    }
    fun getThumbsup(){
        viewModelScope.launch(Dispatchers.IO) {
            val response = GifRepo.getThumbsup()
            if (response.isSuccessful)
                _gifs.postValue(response.body())
        }
    }
    fun getTickle(){
        viewModelScope.launch(Dispatchers.IO) {
            val response = GifRepo.getTickle()
            if (response.isSuccessful)
                _gifs.postValue(response.body())
        }
    }
    fun getWave(){
        viewModelScope.launch(Dispatchers.IO) {
            val response = GifRepo.getWave()
            if (response.isSuccessful)
                _gifs.postValue(response.body())
        }
    }
    fun getWink(){
        viewModelScope.launch(Dispatchers.IO) {
            val response = GifRepo.getWink()
            if (response.isSuccessful)
                _gifs.postValue(response.body())
        }
    }
}