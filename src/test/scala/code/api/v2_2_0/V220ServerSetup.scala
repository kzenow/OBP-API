package code.api.v2_2_0

import code.api.ServerSetupWithTestData

/**
 * Created by markom on 10/14/16.
 */
trait V220ServerSetup extends ServerSetupWithTestData {

  def v1_2Request = baseRequest / "obp" / "v1.2"
  def v1_4Request = baseRequest / "obp" / "v1.4.0"
  def v2_0Request = baseRequest / "obp" / "v2.0.0"
  def v2_1Request = baseRequest / "obp" / "v2.1.0"
  def v2_2Request = baseRequest / "obp" / "v2.2.0"
}