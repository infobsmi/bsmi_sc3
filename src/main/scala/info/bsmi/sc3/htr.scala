package info.bsmi.sc3


trait Htr:
    import com.softwaremill.macwire._
    lazy val htrName = "htrName, 司马光砸缸"
    lazy val emailService = wire[EmailService]