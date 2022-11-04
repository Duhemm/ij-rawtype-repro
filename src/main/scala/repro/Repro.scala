package repro

import org.apache.thrift.TBase
import org.apache.thrift.TDeserializer

class Repro {
  def repro(base: TBase[_, _], bytes: Array[Byte]): Unit = {
    val deserializer = new TDeserializer
    deserializer.deserialize(base, bytes)
  }
}
