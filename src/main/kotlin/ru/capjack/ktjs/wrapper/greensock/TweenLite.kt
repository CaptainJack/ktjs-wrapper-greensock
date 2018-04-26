package ru.capjack.ktjs.wrapper.greensock

@JsModule("ktjs-wrapper-greensock/TweenLite.min")
@JsNonModule
external class TweenLite(target: Any, duration: Double, vars: dynamic) {
	fun kill()
}