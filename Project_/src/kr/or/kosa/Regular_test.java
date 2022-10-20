package kr.or.kosa;

import java.util.Scanner;

public class Regular_test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while(true) {
			String str = scan.nextLine();
			
			System.out.println(str.matches("^((file|gopher|news|nntp|telnet|https?|ftps?|sftp)\\:\\/\\/)?([a-z0-9\\-]+\\.)+[a-z0-9]{2,4}.*$"));
//			URL					: https://cafe.naver.com/kosait
//			^(...|...)			: ¸ñ·Ï¾È¿¡ ÀÖ´Â °Íµé·Î ½ÃÀÛ.. ÀÌ‹š httpsÀÇ s, ftpsÀÇ s ´Â »ý·« °¡´ÉÇÏ´Ù		https
//			\\:\\/\\/			: "://" ¹®ÀÚ ÀÔ·Â 													://
//			([a-z0-9\\-]+\\.)+	: {[a-z ¶Ç´Â 0-9 ¶Ç´Â - ·Î ÀÌ·ç¾îÁø ¹®ÀÚ¿­]ÀÌ . ¾Õ¿¡ 1¹ø ÀÌ»ó ÀÖ°í}			cafe.naver.
//								   {...}À¸·Î ÀÌ·ç¾îÁø ¹®ÀÚ¿­ÀÌ 1¹ø ÀÌ»ó ÀÖÀ½
//			[a-z0-9]{2,4}		: a-z ¶Ç´Â 0-9·Î ÀÌ·ç¾îÁø ¹®ÀÚ 2~4°³										com	(¶Ç´Â co.krÀÇ kr µî)
//			.*$					: .(ÀÓÀÇÀÇ ÇÑ ¹®ÀÚ)°¡ 0°³ ÀÌ»ó ÀÖÀ½. À¸·Î Á¤±ÔÇ¥Çö½Ä ³¡³¿						/kosait
//								  ex) https://meet.google.com[/rxw-hqgv-dpi] ´ë°ýÈ£ ºÎºÐÀ» Ç¥Çö °¡´ÉÇÏ°Ô ÇØÁÜ
			System.out.println(str.matches("^\\d{2,4}[-.\\/]\\d{1,2}[-.\\/]\\d{1,2}$"));
			//³¯Â¥ ( 2000-01-18 / 99.12.03 / 88/7/6 ) µî ¿©·¯ Å¸ÀÔ
			//\\d{2,4} : 2~4 ÀÚ¸® ¼ýÀÚ
			//[-.\\/] : - . / Áß ÇÏ³ª
			//\\d{1,2} : 1~2ÀÚ¸® ¼ýÀÚ
			//[-.\\/] : - . / Áß ÇÏ³ª
			//\\d{1,2} : 1~2ÀÚ¸® ¼ýÀÚ
			
		}
	}
}
/*
//			System.out.println(str.matches(":"));
//			System.out.println(str.matches("^[123][abc]$"));
//			System.out.println(str.matches("^\\d{4}[a-f]{3}$"));//¼ýÀÚ 4°³¿Í a-f»çÀÌ 3°³

Á¤±ÔÇ¥Çö½ÄÀ» Ç¥ÇöÇÒ ¶§ \´Â \\·Î


[|]	>>	 ¶Ç´Â	>>	gray | grey		>> gray ¶Ç´Â grey

±×·ì¹­±â : °ýÈ£ ( )¸¦ »ç¿ëÇØ ¿¬»êÀÚÀÇ ¹üÀ§¿Í ¿ì¼±±ÇÀ» Á¤ÀÇÇÒ ¼ö ÀÖ´Ù.
gr(a|e)y	>>	gray ¶Ç´Â grey // oran(g|y)e	>> orange ¶Ç´Â orayge

? ¹°À½Ç¥ : 0¹ø ¶Ç´Â 1Â÷·Ê±îÁöÀÇ ¹ß»ý
colou?r	>> u°¡ 0¹ø ¶Ç´Â 1¹ø ¹ß»ý	>> color¿Í colour¸¦ ÀÏÄ¡

* º° : 0¹ø ÀÌ»óÀÇ ¹ß»ý
ab*c  >> b°¡ 0¹ø ÀÌ»ó ÀÖ´Â °Í >> ac, abc, abbc, abbbc¸¦ ÀÏÄ¡

+ µ¡¼À : 1¹ø ÀÌ»óÀÇ ¹ß»ý
ab+c >> b°¡ 1¹ø ÀÌ»ó ÀÖ´Â °Í >> abc, abbc, abbbc¸¦ ÀÏÄ¡

{n} : Á¤È®È÷ n¹ø ÀÌ»ó ÀÏÄ¡½ÃÅ²´Ù
{min, } : min¹ø ÀÌ»ó¸¸Å­ ÀÏÄ¡
{min, max} : min¹ø ÀÌ»ó max¹ø ÀÌÇÏ ÀÏÄ¡

.	: 1°³ÀÇ ¹®ÀÚ¿Í ÀÏÄ¡		".ABC" >> aABC eABC ?ABC
[ ] : [¿Í ] »çÀÌÀÇ ¹®ÀÚ Áß ÇÏ³ª¸¦ ¼±ÅÃ. |¸¦ ¿©·¯¹ø ¾´ °Í °ú °°Àº ±â´É
	ex) [abc]d >> ad bd cd Áß ÇÏ³ª // [a-z]F >> a~z »çÀÌ ÇÑ±ÛÀÚ¿Í F aF cF iF mF zF µîµî..

[^ ] : ºÎÁ¤ 	>> [^a-f]w ¾Õ¿¡ a~f°¡ ¾Æ´Ñ °ÍÀÌ ¿À´Â w

^ : ±ÔÄ¢ÀÇ Ã³À½,½ÃÀÛ		^x >> x·Î ½ÃÀÛÇÏ´Â ¹®ÀÚ¿­ 
$ : ±ÔÄ¢ÀÇ ³¡				x$ >> x·Î Á¾·áµÇ´Â ¹®ÀÚ¿­
() : ¹­À½

"\" »ç¿ë¹ý
\^ escape ¹®ÀÚ. ^¸¦ "¹®ÀÚ"·Î »ç¿ëÇÏ°Ú´Ù
\b °ø¹é Ç¥½Ã
\B ¹®ÀÚ + °ø¹é»çÀÌ°¡ ¾Æ´Ñ ¹®ÀÚ Ç¥½Ã
\d ¼ýÀÚ( 0 ~ 9 )
\D ¼ýÀÚ°¡ ¾Æ´Ñ °Í
\s °ø¹é ¹®ÀÚ
\S °ø¹éÀÌ ¾Æ´Ñ ¹®ÀÚ
\t Tap ¹®ÀÚ
\v ¼öÁ÷ Tap ¹®ÀÚ (?)
\w word Ç¥½Ã ( ¾ËÆÄºª + ¼ýÀÚ + _ ) Áß ÇÑ ¹®ÀÚ
\W word°¡ ¾Æ´Ñ °Í Ç¥½Ã ( ¾ËÆÄºª + ¼ýÀÚ + _ ) °¡ ¾Æ´Ñ ÇÑ ¹®ÀÚ


ex)
[0-7]{3} >> 0~7 »çÀÌ ¹®ÀÚ°¡ 7°³
[abcd][423] >> a,b,c,d ¹®ÀÚ Áß 1°³ + 2,3,4 Áß 1°³ Á¶ÇÕ
\w{3}\d{2} >> ¾ËÆÄºª 3°³ + ¼ýÀÚ 2°³ Á¶ÇÕ


°øºÎ?
ÀÌ¸ÞÀÏ
"^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*\\@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*\\.[a-zA-Z]{2,3}$"

^[0-9a-zA-Z]		: 0~9 or a~z or A~Z·Î ½ÃÀÛ
([-_.]?[0-9a-zA-Z])*: [0~9 ¶Ç´Â a~z ¶Ç´Â A~Z]·Î ÀÌ·ç¾îÁø ¹®ÀÚ 0°³ ÀÌ»ó ( [-_.]Àº ÀÖ¾îµµ µÇ°í ¾ø¾îµµ »ó°ü ¾ø´Ù)
\\@					: @ ³Ö¾î¾ß µÈ´Ù
[0-9a-zA-Z]			:0~9 or a~z or A~Z ÇÑ±ÛÀÚ
([-_.]?[0-9a-zA-Z])*:[0~9 ¶Ç´Â a~z ¶Ç´Â A~Z]·Î ÀÌ·ç¾îÁø ¹®ÀÚ 0°³ ÀÌ»ó ( [-_.]Àº ÀÖ¾îµµ µÇ°í ¾ø¾îµµ »ó°ü ¾ø´Ù)
//.					: . ³ÖÀ½
[a-zA-Z]{2,3}$		: a~z ¶Ç´Â A~Z·Î ÀÌ·ç¾îÁø ¹®ÀÚ 2~3°³·Î ¹®ÀåÀ» ³¡³¿


URL
^(file|gopher|news|nntp|telnet|https?|ftps?|sftp)\\:\\/\\/([a-z0-9-]+\.)+[a-z0-9]{2,4}\\.*$
^(...|...)		: ¸ñ·Ï¾È¿¡ ÀÖ´Â °Íµé·Î ½ÃÀÛ 
\\:\\/\\/		: "://" ¹®ÀÚ ÀÔ·Â 
([a-z0-9-]+\\.)+: a-z ¶Ç´Â 0-9 ¶Ç´Â .À¸·Î ÀÌ·ç¾îÁø ¹®ÀÚ¿­ÀÌ 1¹ø ÀÌ»ó ÀÖÀ½
[a-z0-9]{2,4}	: a-z ¶Ç´Â 0-9·Î ÀÌ·ç¾îÁø ¹®ÀÚ 2~4°³
\\.*$			: "." ÀÔ·ÂÀÌ 0¹ø ÀÌ»ó ÀÖÀ½ (??) À¸·Î Á¤±ÔÇ¥Çö½Ä ³¡³¿

ÈÞ´ëÆù ¹øÈ£
/^(01[01346-9])-?([1-9]{1}[0-9]{2,3})-?([0-9]{4})$/

2021-01-01 ¶Ç´Â 21-01-01 À¸·Î ±¸ºÐÀÚ´Â ÇÏÀÌÇÂ(-), Á¡(.), ½½·¡½Ã(/) ·Î ÀÔ·ÂµÈ °æ¿ì 
/^\d{2,4}\[-.\/]\d{1,2}\[-.\/]\d{1,2}$/
 
 2021-01-01 ¶Ç´Â 21-01-01 
/^\d{2,4}-\d{1,2}-\d{1,2}$/
 
 2021/01/01 ¶Ç´Â 21/01/01 
/^\d{2,4}\/\d{1,2}\/\d{1,2}$/
 
 2021.01.01 ¶Ç´Â 21.01.01 
/^\d{2,4}\.\d{1,2}\.\d{1,2}$/


ÁÖ¹Îµî·Ï¹øÈ£
/^([0-9]{6})-?([0-9]{7})$/
/^(\d{6})-?(\d{7})$/

ºñ¹Ð¹øÈ£
Æ¯¼ö¹®ÀÚ°¡ ÃÖ¼Ò 1°³ ÀÌ»ó Æ÷ÇÔµÈ ¿µ¾î,¼ýÀÚ Á¶ÇÕÀÇ 6~30°³ÀÇ ±ÛÀÚ
/^(?=.*[a-zA-Z])((?=.*\d)|(?=.*\W))(?=.*[!@#$%^*+=-]).{6,30}$/



ETC

 ¿µ¾î¿Í ¼ýÀÚ¸¸ ÀÔ·Â (alnum)
/^[0-9a-zA-Z]+$/
 
 ÇÑ±Û¸¸ ÀÔ·Â 
/^[¤¡-ÆR]+$/
 
 ¿µ¾î¸¸ ÀÔ·Â 
/^[a-zA-Z]+$/
 
 ¼ýÀÚ¸¸ ÀÔ·Â 
/^[0-9]+$/
 
 ¼Ò¼ýÁ¡ÀÌ ÀÖ´Â ±Ý¾× Çü½Ä 
/^[0-9\,\.]+$/
 
 °ø¹é(½ºÆäÀÌ½º) 
/\s/
 
 HTML ÄÚµå 
/\<(/?[^\>]+)\>/
 
 Ã·ºÎÆÄÀÏ ÁöÁ¤µÈ È®ÀåÀÚ È®ÀÎ 
/([^\s]+(?=\.(jpg|gif|png))\.\2)/















*/