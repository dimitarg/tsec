package tsec.cipher.instances.mode

sealed trait NoMode
object NoMode extends DefaultModeKeySpec[NoMode]("NONE")
