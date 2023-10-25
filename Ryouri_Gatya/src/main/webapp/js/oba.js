import { 
    getCustomProperty, 
    incrementCustomProperty, 
    setCustomProperty 
} from "./updateCustomProperty.js"

const obaElem = document.querySelector("[data-oba]")
const JUMP_SPEED = 0.45
const GRAVITY = 0.0015
const OBA_FRAME_COUNT = 2
const FRAME_TIME = 100


let isJumping
let obaFrame
let currentFrameTime
let yVelocity

export function setupOba(){
    isJumping = false
    obaFrame = 0
    currentFrameTime = 0
    yVelocity = 0
    setCustomProperty(obaElem, "--bottom", 0)
    document.removeEventListener("keydown", onJump)
    document.addEventListener("keydown", onJump)

}

export function updateOba(delta, speedScale){
    handleRun(delta, speedScale)
    handleJump(delta)
}

export function getOvaRect(){
    return obaElem.getBoundingClientRect()
}


export function setObaLose(){
    obaElem.src = "../imgs/oba-lose.png"
}

function handleRun(delta, speedScale){
    if(isJumping){
        obaElem.src = `../imgs/oba-stationary.png`
        return 

    }

    if (currentFrameTime >= FRAME_TIME ){
        obaFrame = (obaFrame +1) % OBA_FRAME_COUNT
        obaElem.src = `../imgs/oba-run-${obaFrame}.png`
        currentFrameTime -= FRAME_TIME

    }
    currentFrameTime += delta * speedScale
}

function handleJump(delta){
    if(!isJumping) return

    incrementCustomProperty(obaElem, "--bottom", yVelocity * delta)

    if(getCustomProperty(obaElem, "--bottom") <= 0){
        setCustomProperty(obaElem, "--bottom", 0)
        isJumping = false
    }

    yVelocity -= GRAVITY * delta
}

function onJump(e){
    if(e.code !== "Space" || isJumping) return

    yVelocity = JUMP_SPEED
    isJumping = true

}