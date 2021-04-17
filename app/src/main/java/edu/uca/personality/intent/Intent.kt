package edu.uca.personality.intent

sealed class Intent{
    object GetPlaceEvent: Intent()
    object None: Intent()
}