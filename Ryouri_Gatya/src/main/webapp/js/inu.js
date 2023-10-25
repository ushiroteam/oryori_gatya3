import {
    setCustomProperty,
    incrementCustomProperty,
    getCustomProperty,
  } from "./updateCustomProperty.js"
  
  const SPEED = 0.05
  const INU_INTERVAL_MIN = 500
  const INU_INTERVAL_MAX = 2000
  const worldElem = document.querySelector("[data-world]")
  
  let nextInuTime
  export function setupInu() {
    nextInuTime = INU_INTERVAL_MIN
    document.querySelectorAll("[data-inu]").forEach(inu => {
      inu.remove()
    })
  }
  
  export function updateInu(delta, speedScale) {
    document.querySelectorAll("[data-inu]").forEach(inu => {
      incrementCustomProperty(inu, "--left", delta * speedScale * SPEED * -1)
      if (getCustomProperty(inu, "--left") <= -100) {
        inu.remove()
      }
    })
  
    if (nextInuTime <= 0) {
      createInu()
      nextInuTime =
        randomNumberBetween(INU_INTERVAL_MIN, INU_INTERVAL_MAX) / speedScale
    }
    nextInuTime -= delta
  }
  
  export function getInuRects() {
    return [...document.querySelectorAll("[data-inu]")].map(inu => {
      return inu.getBoundingClientRect()
    })
  }
  
  function createInu() {
    const inu = document.createElement("img")
    inu.dataset.inu = true
    inu.src = "../imgs/cactus.png"
    inu.classList.add("inu")
    setCustomProperty(inu, "--left", 100)
    worldElem.append(inu)
  }
  
  function randomNumberBetween(min, max) {
    return Math.floor(Math.random() * (max - min + 1) + min)
  }