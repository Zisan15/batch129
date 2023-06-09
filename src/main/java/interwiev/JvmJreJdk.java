package interwiev;

public class JvmJreJdk {
    /*
    JVM,JRE ve JDK Nedir?
Bu yazımızda Java ile geliştirme yapan herkesin bilmesi gereken en basit kavramlardan olan JVM,JRE ve JDK kavramları üzerinde duracağız.
JVM(Java Virtual Machine) için java programının çalıştığı platform ile java programı arasında
 soyut bir ara katman diyebiliriz. JVM; platforma bağımlı olarak çalışır.
 Yani geliştirme yapacağınız platforma(Windows,Linux,Mac) göre farklı implementasyonları mevcuttur.

 JVM; bizim yazdığımız .java uzantılı dosyaları anlamaz onun yerine derlenmiş .class uzantılı dosyaları anlar.
 Çünkü .class uzantılı dosyalar içlerinde bytecode lar içerirler. Bu özelik sayesinde Java da “Write once,Run everywhere”
 özeliğini kullanabiliyoruz. Yani bu şu demek oluyor; bizim windows bir makinede yazmış olduğumuz uygulama önce Compiler
  tarafından bytecode lara çevriliyor daha sonra bu bytecode lar diğer platformlarda kurulu olan JVM ler aracılığıyla tüm platformlarda çalışıyor.

JVM Çalışma Prensibi
JRE(Java Runtime Enviroment) ise java programlama dili ile yazılmış olan uygulama ve appletlerin
çalışmasını sağlayan bileşenler ile JVM e kütüphaneler sağlar.Derlenmiş byte codelar direk olarak CPU üzerinde çalışmazlar.
CPU tarafından anlaşılması için aradaki JVM bytecode ları okunabilir makine kodları olarak yorumlar.
Aslında; java bytecode ların bütün platformalarda çalışması JRE sayesindedir. İçerisinde; JVM, Core kitaplıkları ve
Java yazılımında yazılan uygulamaları ve küçük uygulamaları çalıştırmak için diğer ek bileşenleri içerir. JRE’nin görevi
Java kodları derlendikten sonra bir ara dil olarak kabul edilen Java bayt kodlarını oluşturmaktır. Bu bayt kodlar bütün
 işletim sistemleri için aynıdır.

JDK-JRE-JVM Genel Resim
JDK(Java Development Kit) ise java da geliştirme yapmak isteyen her developer ın mutlaka indirmesi gereken bir
 bileşendir. Kısaca java için SDK(Software Development Kit) diyebiliriz. Hem yorumlayıcı hem de derleyici görevini
  üstlenmektedir.JRE ile birlikte appletleri ve uygulamaları geliştirirken zorunlu olan debuggers ve compilers gibi
  geliştirme araçlarını da bünyesinde bulundurur.
O zaman Özetle şu şekilde düşünebiliriz:
JRE=JVM + Java Kütüphaneleri
JDK=JRE + Compiler + debugger
Sonunda kadar okuduğunuz için teşekkür ederim. Umarım sizler için faydalı bir kaynak olmuştur.Bundan sonraki süreçte de
 haftada bir kez java ile ilgili birçok konuda yazı yazmaya devam edeceğim.
     */
}
