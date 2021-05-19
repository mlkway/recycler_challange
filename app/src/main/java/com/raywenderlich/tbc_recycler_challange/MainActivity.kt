package com.raywenderlich.tbc_recycler_challange

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.raywenderlich.tbc_recycler_challange.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val animalList = mutableListOf<Animal>()

    private lateinit var adapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        makeAnimalObjectsAndPutInList()

        init()
    }


    private fun init(){

        adapter = MyAdapter(animalList)
        binding.recyclerview.layoutManager = LinearLayoutManager(this)
        binding.recyclerview.adapter = adapter

    }



    private fun makeAnimalObjectsAndPutInList(){
        val bee = Animal(R.mipmap.bee,"bee", "i make beeees!!!!")
        val bird = Animal(R.mipmap.bird,"Bird", "I can fly ")
        val butterfly = Animal(R.mipmap.butterfly,"Butterfly", "i have only two day")
        val cat = Animal(R.mipmap.cat,"Cat", "I dont care anyone or anything except my personal happines but every one loves me ")
        val cow = Animal(R.mipmap.cow,"Cow", "MilkMaker")
        val dog = Animal(R.mipmap.dog,"Dog", "now i am human best friend")
        val elephant = Animal(R.mipmap.elephant,"Elephant", "I like to play rugby")
        val fox = Animal(R.mipmap.fox,"Fox", "Everyone need my kurki")
        val frog = Animal(R.mipmap.frog,"Frog", "i make beeees!!!!")
        val giraffe = Animal(R.mipmap.giraffe,"Giraffe", "best basketball player of all time")
        val hen = Animal(R.mipmap.hen,"Hen", "my name is mamali but everybody calls me yiyliyo")
        val koala = Animal(R.mipmap.koala,"Koala", "in this case temo is very lazy to googling about koalas")
        val lion = Animal(R.mipmap.lion,"King", "I am not in danger, I am the danger, You now my name")
        val owl = Animal(R.mipmap.owl,"Owl", "I am symbol of wisdom")
        val pengiun = Animal(R.mipmap.penguin,"Penguin", "i like fish and bidzina ")
        val sloth = Animal(R.mipmap.sloth,"Sloth", "i like to hanging Around")
        val squirrel = Animal(R.mipmap.squirrel,"Squirrel", "i like some nuts")
        val whale = Animal(R.mipmap.whale,"Whale", "Gigant of the sea")
        animalList.apply {
            add(bee)
            add(bird)
            add(butterfly)
            add(cat)
            add(cow)
            add(dog)
            add(elephant)
            add(fox)
            add(frog)
            add(giraffe)
            add(hen)
            add(koala)
            add(lion)
            add(owl)
            add(whale)
            add(squirrel)
            add(pengiun)
            add(sloth)
        }
    }



}