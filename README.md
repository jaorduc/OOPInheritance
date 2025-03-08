<div id="header"><p style="color:#2ea44f; text-align:center; font-weight:bold; font-family:verdana; font-size:25px;">Inheritance with Java</p></div>

[licenseBDG]: https://img.shields.io/badge/License-CC-orange?style=plastic
[license]: https://creativecommons.org/licenses/by-nc-sa/3.0/deed.en

[mywebsiteBDG]:https://img.shields.io/badge/website-jaorduz.github.io-0abeeb?style=plastic
[mywebsite]: https://jaorduz.github.io/

[mygithubBDG-jaorduz]: https://img.shields.io/badge/jaorduz-repos-blue?logo=github&label=jaorduz&style=plastic
[mygithub-jaorduz]: https://github.com/jaorduz/

[mygithubBDG-jaorduc]: https://img.shields.io/badge/jaorduc-repos-blue?logo=github&label=jaorduc&style=plastic 
[mygithub-jaorduc]: https://github.com/jaorduc/

[myXprofileBDG]: https://img.shields.io/static/v1?label=Follow&message=jaorduc&color=2ea44f&style=plastic&logo=X&logoColor=black
[myXprofile]:https://twitter.com/jaorduc


[![website - jaorduz.github.io][mywebsiteBDG]][mywebsite]
[![Github][mygithubBDG-jaorduz]][mygithub-jaorduz]
[![Github][mygithubBDG-jaorduc]][mygithub-jaorduc]
[![Follow @jaorduc][myXprofileBDG]][myXprofile]
[![CC License][licenseBDG]][license]

---

<p style="text-align:right; font-family:verdana;"><a href="mywebsite" style="color:#2ea44f; text-decoration:none;">@Javier Orduz</a></p>


This repository contains a short explain and an example about Inheritance concept with a brief Java implementation. 

# Requirements and assumptions

1. You should have Java installed on you computer.
1. You should have basic level of knowledge about this programming language, but I will be happy to support.
1. I have added some files about installation and steps to start with Java.

# Inheritance

It is one of the OOP pilars through one class inherits the atributes and methods of another.

<a href="https://commons.wikimedia.org/wiki/File:4pillars.webp" target="_blank"><img src="https://upload.wikimedia.org/wikipedia/commons/3/3e/4pillars.webp" alt="Figure source." style="width:50%"></a>


## Implementation
To talk about inheritance in the progamming context, we will create the following files,

1. Main.java
1. Animal.java
1. Bird.java
1. Dog.java
1. Fish.java

<a href="https://itoldya420.getarchive.net/media/fish-fins-carp-science-technology-a93366" target="_blank"><img src="https://cdn12.picryl.com/photo/2016/12/31/fish-fins-carp-science-technology-a93366-1024.jpg" alt="Figure source." style="width:30%"></a>
<a href="https://itoldya420.getarchive.net/media/fish-fins-carp-science-technology-a93366" target="_blank"><img src="https://www.shutterstock.com/image-vector/illustrator-body-parts-bird-260nw-1317824753.jpg" alt="Figure source." style="width:16%"></a>  <a href="https://itoldya420.getarchive.net/media/fish-fins-carp-science-technology-a93366" target="_blank"><img src="https://live.staticflickr.com/2792/4394640467_a684b9c629_b.jpg" alt="Figure source." style="width:24%"></a>

This is a first approach about Inheritance concept with a quick implementation in Java.

# Try out!

Go to this website:Ref. [<a href="https://pythontutor.com/java.html" target="_blank">4</a>] and introduce this code:

```Java
class Animal {
    void fly(){
        System.out.println("This animal flies");
    }
    void high(){
        System.out.println("This animal lives up high");
    } 
}


public class Bird extends Animal{
    int wings = 2;
    public void chirp(){
        System.out.println("is chirping");
    }


    public static void main(String[] args){
        System.out.println("Hi Inheritance!");        
        Bird bird = new Bird();
        bird.fly();
        bird.chirp();
    }
}
```
Check the simulation, then add one atribute, and one subclass.

# References

<!-- 1. Source: [Wikipedia](https://commons.wikimedia.org/wiki/File:4pillars.webp) -->

1. To dowload [Java](https://www.oracle.com/java/technologies/downloads/)

1. Source for the images [fish](https://itoldya420.getarchive.net/media/fish-fins-carp-science-technology-a93366)

1. Inheritance [OpenDSA](https://opendsa-server.cs.vt.edu/OpenDSA/Books/IntroToSoftwareDesign/html/InheritanceAndPolymorphism.html)

1. Visualization: [pythontutor](https://pythontutor.com/java.html)