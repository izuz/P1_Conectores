-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 22-01-2019 a las 20:33:26
-- Versión del servidor: 10.1.29-MariaDB
-- Versión de PHP: 7.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `disco`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `album`
--

CREATE TABLE `album` (
  `id_album` int(11) NOT NULL,
  `titulo` varchar(30) COLLATE utf8_bin NOT NULL,
  `fecha_publicacion` year(4) NOT NULL,
  `artista` varchar(30) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `album`
--

INSERT INTO `album` (`id_album`, `titulo`, `fecha_publicacion`, `artista`) VALUES
(1, 'A Night at the Opera', 1975, 'Queen');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cancion`
--

CREATE TABLE `cancion` (
  `id_cancion` int(11) NOT NULL,
  `titulo` varchar(30) COLLATE utf8_bin NOT NULL,
  `duracion` varchar(30) COLLATE utf8_bin NOT NULL,
  `letra` text COLLATE utf8_bin NOT NULL,
  `id_album` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `cancion`
--

INSERT INTO `cancion` (`id_cancion`, `titulo`, `duracion`, `letra`, `id_album`) VALUES
(1, 'Death on two legs', '3:44', 'You suck my blood like a leech\r\nYou break the law and you breach\r\nScrew my brain till it hurts\r\nYou\'ve taken all my money - you still want more,\r\nMisguided old mule\r\nWith your pigheaded rules\r\nWith your narrow - minded cronies who are fools of the first division-\r\nDeath on two legs -\r\nYou\'re tearing me apart,\r\nDeath on two legs\r\nYou never had a heard of your own -\r\nKill joy, Bad guy,\r\nBig talking, Small fry\r\nYou\'re just an old barrow - boy\r\nHave you found a new toy to replace me,\r\nCan you face me -\r\nBut now you can kiss my ass goodbye\r\nFeel good, are you satisfied\r\nDo you feel like suicide (I think you should)\r\nIs your conscience all right\r\nDoes it plague you at night,\r\nDo you feel good - Feel good!\r\nTalk like a big business tycoon,\r\nBut you\'re just a hot - air balloon,\r\nSo no one gives you a damn,\r\nYou\'re just an overgrown school - boy\r\nLet me tan your hide.\r\nA dog with disease,\r\nKing of the \'sleaze\'\r\nPut your money where your mouth is Mr. Know all,\r\nWas the fin on your back part of the deal...(shark!)\r\nDeath on two legs\r\nYou\'re tearing me apart\r\nDeath on two legs -\r\nYou never had a heart of your own,\r\n(You never did, right from the start)\r\nInsane you should be put inside,\r\nYou\'re a sewer - rat decaying in a cesspool of pride\r\nShould be made unemployed\r\nThen make yourself null - and - void,\r\nMake me feel good\r\nI feel good.', 1),
(2, 'Lazing on a Sunday Afternoon', '1:07', 'I go out to work on a Monday morning\r\nTuesday I go off to honeymoon\r\nI\'ll be back again before it\'s time for Sunny-down,\r\nI\'ll be lazing on a Sunday afternoon\r\nBicycling on every Wednesday evening\r\nThursday I go waltzing to the Zoo\r\nI come from London town, I\'m just an ordinary guy,\r\nFridays I go painting in the Louvre\r\nI\'m bound to be proposing on a Saturday night (There he goes again)\r\nI\'ll be lazing on a Sunday\r\nlazing on a Sunday\r\nlazing on a Sunday Afternoon.', 1),
(3, 'I’m in Love With My Car', '3:05', 'Oh\r\nThe machine of a dream, such a clean machine\r\nWith the pistons a pumpin\', and the hubcaps all gleam\r\nWhen I\'m holding your wheel\r\nAll I hear is your gear\r\nWith my hand on your grease gun\r\nMmm, it\'s like a disease, son\r\nI\'m in love with my car, gotta feel for my automobile\r\nGet a grip on my boy racer roll bar\r\nSuch a thrill when your radials squeal\r\nTold my girl I\'ll have to forget her\r\nRather buy me a new carburetor\r\nSo she made tracks saying this is the end, now\r\nCars don\'t talk back they\'re just four wheeled friends now\r\nWhen I\'m holding your wheel\r\nAll I hear is your gear\r\nWhen I\'m cruisin\' in overdrive\r\nDon\'t have to listen to no run of the mill talk jive\r\nI\'m in love with my car (love with my car), gotta feel for my automobile\r\nI\'m in love with my car (love with my car), string back gloves in my automolove', 1),
(4, 'You’re My Best Friend', '2:52', 'Ooh, you make me live\r\nWhatever this world can give to me\r\nIt\'s you you\'re all I see\r\nOoh, you make me live now honey\r\nOoh, you make me live\r\nOh, you\'re the best friend that I ever had\r\nI\'ve been with you such a long time\r\nYou\'re my sunshine and I want you to know\r\nThat my feelings are true\r\nI really love you\r\nOh, you\'re my best friend\r\nOoh, you make me live\r\nOoh, I\'ve been wandering \'round\r\nBut I still come back to you\r\nIn rain or shine\r\nYou\'ve stood by me girl\r\nI\'m happy at home\r\nYou\'re my best friend\r\nOoh, you make me live\r\nWhenever this world is cruel to me\r\nI got you to help me forgive\r\nOoh, you make me live now honey\r\nOoh, you make me live\r\nYou\'re the first one\r\nWhen things turn out bad\r\nYou know I\'ll never be lonely\r\nYou\'re my only one\r\nAnd I love the things\r\nI really love the things that you do\r\nOh, you\'re my best friend\r\nOoh, you make me live\r\nI\'m happy at home\r\nYou\'re my best friend\r\nOh, you\'re my best friend\r\nOoh, you make me live\r\nYou\'re my best friend', 1),
(5, '\'39', '3:31', 'In the year of \'39 assembled here the volunteers\r\nIn the days when lands were few\r\nHere the ship sailed out into the blue and sunny morn\r\nThe sweetest sight ever seen\r\nAnd the night followed day\r\nAnd the story tellers say\r\nThat the score brave souls inside\r\nFor many a lonely day sailed across the milky seas\r\nNe\'er looked back, never feared, never cried\r\nDon\'t you hear my call though you\'re many years away\r\nDon\'t you hear me calling you\r\nWrite your letters in the sand\r\nFor the day I take your hand\r\nIn the land that our grandchildren knew\r\nIn the year of \'39 came a ship in from the blue\r\nThe volunteers came home that day\r\nAnd they bring good news of a world so newly born\r\nThough their hearts so heavily weigh\r\nFor the earth is old and grey, little darling, we\'ll away\r\nBut my love this cannot be\r\nFor so many years have gone though I\'m older but a year\r\nYour mother\'s eyes, from your eyes, cry to me\r\nDon\'t you hear my call though you\'re many years away\r\nDon\'t you hear me calling you\r\nWrite your letters in the sand for the day I take your hand\r\nIn the land that our grandchildren knew\r\nDon\'t you hear my call though you\'re many years away\r\nDon\'t you hear me calling you\r\nAll your letters in the sand cannot heal me like your hand\r\nFor my life\r\nStill ahead\r\nPity me', 1),
(11, 'Sweet Lady', '4:04', 'Oh, I like it\r\nYou call me up and treat me like a dog\r\nYou call me up and tear me up inside\r\nYou\'ve got me on a lead\r\nOh, you bring me down\r\nYou shout around\r\nYou don\'t believe that I\'m alone\r\nOh, you don\'t believe me\r\nSweet lady\r\nSweet lady\r\nSweet lady sweet lady oh, stay sweet\r\nYou say\r\nYou call me up and feed me all the lines\r\nYou call me sweet like I\'m some kind of cheese\r\nWaiting on the shelf\r\nYou eat me up\r\nYou hold me down\r\nI\'m just a fool to make you a home\r\nOh, you really do me\r\nWhen you say\r\nSweet lady (sweet lady)\r\nSweet lady (sweet lady)\r\nSweet lady oh, come on, stay sweet\r\nMy sweet lady\r\nThough it seems like we wait forever oh ah oh\r\nStay sweet baby\r\nBelieve and we\'ve got everything we need \r\n(Got everything we need)\r\nSweet lady\r\nSweet lady\r\nSweet lady oh, oh, stay sweet, stay sweet\r\nOh runaway, come on, yeah yeah, yeah yeah, sweet lady\r\nWoo', 1),
(12, 'Seaside Rendezvous', '2:17', 'Seaside whenever you stroll along with me\r\nI\'m merely contemplating what you feel inside\r\nMeanwhile I ask you to be my Clementine\r\nYou say you will if you could but you can\'t\r\nI love you madly\r\nLet my imagination run away with you gladly\r\nA brand new angle highly commendable\r\nSeaside rendezvous\r\nI feel so romantic can we do it again?\r\nCan we do it again sometime uh I\'d like that\r\nFantastic see est la vie mesdames et messieurs\r\nAnd at the peak of the season\r\nThe Mediterranean\r\nThis time of year it\'s so fashionable\r\nI feel like dancing in the rain\r\nCan I have a volunteer?\r\nJust keep right on dancing\r\nWhat a damn jolly good idea\r\nIt\'s such a jollification as a matter of fact\r\nSo très charmant my dear\r\nUnderneath the moonlight\r\nTogether we\'ll sail across the sea\r\nReminiscing every night\r\nMeantime I ask you to be my valentine\r\nYou say you\'d have to tell your daddy if you can\r\nI\'ll be your Valentino\r\nWe\'ll ride upon an omnibus and then the casino\r\nGet a new facial \r\nStart a sensational\r\nSeaside rendezvous so adorable\r\nSeaside rendezvous oh\r\nSeaside rendezvous, give us a kiss', 1),
(13, 'The Prophet\'s Song', '8:21', 'Oh oh people of the earth\r\nListen to the warning\r\nThe Seer he said\r\nBeware the storm that gathers here\r\nListen to the wise man\r\nI dreamed I saw on a moonlit stair\r\nSpreading his hands on the multitude there\r\nA man who cried for a love gone stale\r\nAnd ice cold hearts of charity bare\r\nI watched as fear took the old men\'s gaze\r\nHopes of the young in troubled graves\r\nI see no day, I heard him say\r\nSo grey is the face of every mortal\r\nOh oh people of the earth\r\nListen to the warning\r\nThe prophet he said\r\nFor soon the cold of night will fall\r\nSummoned by your own hand\r\nOh oh children of the land\r\nQuicken to the new life\r\nTake my hand\r\nOoh, fly and find the new green bough\r\nReturn like the white dove\r\nHe told of death as a bone white haze\r\nTaking the lost and the unloved babe\r\nLate too late all the wretches run\r\nThese kings of beasts now counting their days\r\nFrom mother\'s love is the son estranged\r\nMarried his own his precious gain\r\nThe earth will shake in two will break\r\nAnd death all around will be your dow\'ry\r\nOh oh people of the earth\r\nListen to the warning the seer he said\r\nFor those who hear and mark my words\r\nListen to the good plan\r\nOh oh oh oh - and two by two my human zoo\r\nThey\'ll be\r\nRunning for to come\r\nRunning for to come\r\nOut of the rain\r\nOh, flee for your life\r\nWho heed me not, let all your treasure make you\r\nOh, fear for your life\r\nDeceive you not the fires of hell will take you\r\nShould death await you\r\nOh, oh, people can you hear me (oh, oh, people can you hear me)\r\n(Oh, oh, people can you hear me)\r\nNow I know (now I know) (now I know)\r\nNow I know (now I know) (now I know)\r\nNow I know (now I know) (now I know)\r\nNow I know that you can hear me (now I know that you can hear me)\r\n(Now I know that you can hear me)\r\nNow I know (now I know) (now I know)\r\nNow I know (now I know) (now I know)\r\nNow I know (now I know) (now I know)\r\nNow I know (now I know) (now I know)\r\nNow I know (now I know) (now I know)\r\nNow I know (now I know) (now I know)\r\nNow I know (now I know) (now I know)\r\nNow I know (now I know) (now I know)\r\nNow I know (now I know) (now I know)\r\nNow I know (now I know) (now I know)\r\nThe Earth will shake in two will break in two will\r\nShake in two will break in two\r\n(The Earth will shake in two will break in two will\r\nShake in two will break in two)\r\n(The Earth will shake in two will break in two will\r\nShake in two will break in two)\r\nDoubts all around around around around around around around around\r\n(Doubts all around around around around around around around around)\r\n(Doubts all around around around around around around around around)\r\nNow I know (now I know) (now I know)\r\nNow I know (now I know) (now I know)\r\nNow I know (now I know) (now I know)\r\nNow I know (now I know) (now I know)\r\nNow I know (now I know) (now I know)\r\nNow I know (now I know) (now I know)\r\nNow I know (now I know) (now I know)\r\nNow I know (now I know) (now I know)\r\nNow I know (now I know) (now I know)\r\nNow I know (now I know) (now I know)\r\nNow I know (now I know) (now I know)\r\nWow ooh wow ooh wow ooh wow ooh wow ooh wow ooh wow ooh wow ooh\r\n(Wow ooh wow ooh wow ooh wow ooh wow ooh wow ooh wow ooh wow ooh)\r\n(Wow ooh wow ooh wow ooh wow ooh wow ooh wow ooh wow ooh wow ooh)\r\nListen to the wise (listen to the wise) (listen to the wise)\r\nListen to the wise (listen to the wise) (listen to the wise)\r\nListen to the wise (listen to the wise) (listen to the wise)\r\nListen to the wise (listen to the wise) (listen to the wise)\r\nListen to the wise man (listen to the wise man) (listen to the wise man)\r\nLaa laa - la la la la laa laa (laa laa - la la la la laa laa)\r\nLa la la la laa laa (la la la la laa laa)\r\nLa la la la laa laa (la la la la laa laa)\r\nLa la la la laa laa (la la la la laa laa)\r\nLa la la la laa laa (la la la la laa laa)\r\nLa la la la laa laa (la la la la laa laa)\r\nLa la la la laa laa (la la la la laa laa)\r\nLa la laa laa (la la laa laa)\r\nLa la laa laa (la la laa laa)\r\nLa la (la la)\r\nCome here (Come here)\r\nI you come here (I you come here)\r\nI you come here (I you come here)\r\nI you (aah)\r\nAah (aah)\r\nAhaa (ahaa)\r\nAah (aah)\r\nAhaa (ahaa)\r\nListen to the mad (Listen to the mad)\r\nListen to the man (Listen to the man)\r\nListen to the mad (Listen to the mad)\r\nListen to the mad man (Listen to the mad man)\r\nGod give you the grace to purge this place\r\nAnd peace all around may be your fortune\r\nOh oh children of the land\r\nLove is still the answer, take my hand\r\nThe vision fades, a voice I hear\r\n\"Listen to the madman\"\r\nOoh, but still I fear and still I dare not\r\nLaugh at the madman', 1),
(14, 'Love of my life', '3:39', 'Love of my life, you\'ve hurt me\r\nYou\'ve broken my heart and now you leave me\r\nLove of my life, can\'t you see?\r\nBring it back, bring it back\r\nDon\'t take it away from me, because you don\'t know\r\nWhat it means to me\r\nLove of my life, don\'t leave me\r\nYou\'ve stolen my love, you now desert me\r\nLove of my life, can\'t you see?\r\nBring it back, bring it back (back)\r\nDon\'t take it away from me\r\nBecause you don\'t know\r\nWhat it means to me\r\nObrigado\r\nYou will remember\r\nWhen this is blown over\r\nEverything\'s all by the way\r\nWhen I grow older\r\nI will be there at your side to remind you\r\nHow I still love you (I still love you)\r\nI still love you\r\nOh, hurry back, hurry back\r\nDon\'t take it away from me\r\nBecause you don\'t know what it means to me\r\nLove of my life\r\nLove of my life\r\nOoh, eh (alright)', 1),
(15, 'Good Company', '3:23', 'Take good core of what you\'ve got\r\nMy father said to me\r\nAs he puffed his pipe and Baby B.\r\nHe dandled on his knee\r\nDon\'t fool with fools who\'ll turn away\r\nKeep all Good Company\r\nOo Hoo Oo Hoo\r\nTake care of those you call your own\r\nAnd keep Good Company\r\nSoon I grew and happy too\r\nMy very good friends and me\r\nWe\'d play all day and Sally J.\r\nThe girl from number four\r\nAnd very soon I begged her won\'t you\r\nKeep me Company\r\nNow marriage is an insinuation sure\r\nMy wife and I our needs and nothing more All my friends by a year\r\nBy and by disappear\r\nBut we\'re safe enough behind our door.\r\nI flourished in my humble trade\r\nMy reputation grew\r\nThe work devoured my waking hours\r\nBut when my time was through\r\nReward of all my efforts my own\r\nLimited Company\r\nI hardly noticed Sall as we\r\nPated Company\r\nAll through the years in the end it appears\r\nThere was never really anyone but me\r\nNow I\'m old I puff my pipe\r\nBut no-one\'s there to see\r\nI ponder on the lesson of\r\nMy life\'s insanity\r\nTake care of those you call your own\r\nAnd Keep Good Company', 1),
(16, 'Bohemian Rhapsody', '5:55', 'Is this the real life?\r\nIs this just fantasy?\r\nCaught in a landslide\r\nNo escape from reality\r\nOpen your eyes\r\nLook up to the skies and see\r\nI\'m just a poor boy, I need no sympathy\r\nBecause I\'m easy come, easy go\r\nA little high, little low\r\nAnyway the wind blows, doesn\'t really matter to me, to me\r\nMama, just killed a man\r\nPut a gun against his head\r\nPulled my trigger, now he\'s dead\r\nMama, life had just begun\r\nBut now I\'ve gone and thrown it all away\r\nMama, oh oh \r\nDidn\'t mean to make you cry\r\nIf I\'m not back again this time tomorrow\r\nCarry on, carry on, as if nothing really matters\r\nToo late, my time has come\r\nSends shivers down my spine\r\nBody\'s aching all the time\r\nGoodbye everybody I\'ve got to go\r\nGotta leave you all behind and face the truth\r\nMama, oh oh (anyway the wind blows)\r\nI don\'t want to die\r\nSometimes wish I\'d never been born at all\r\nI see a little silhouetto of a man\r\nScaramouch, Scaramouch will you do the Fandango\r\nThunderbolt and lightning very very frightening me\r\nGallileo, Gallileo, Gallileo, Gallileo, Gallileo, figaro, magnifico\r\nI\'m just a poor boy and nobody loves me\r\nHe\'s just a poor boy from a poor family\r\nSpare him his life from this monstrosity\r\nEasy come easy go will you let me go\r\nBismillah, no we will not let you go, let him go\r\nBismillah, we will not let you go, let him go\r\nBismillah, we will not let you go, let me go\r\n(Will not let you go) let me go (never, never let you go) let me go (never let me go)\r\nOh oh no, no, no, no, no, no, no\r\nOh mama mia, mama mia, mama mia let me go\r\nBeelzebub has a devil put aside for me for me for me\r\nSo you think you can stop me and spit in my eye\r\nSo you think you can love me and leave me to die\r\nOh baby can\'t do this to me baby\r\nJust gotta get out just gotta get right outta here\r\nOh oh oh yeah, oh oh yeah\r\nNothing really matters\r\nAnyone can see\r\nNothing really matters \r\nNothing really matters to me\r\nAnyway the wind blows', 1),
(17, 'God Save the Queen', '1:15', 'Thank you beautiful people!\r\nYou\'ve been a tremendous - you\'ve been a really special audience.\r\nThank you very much.\r\nGoodnight, sweet dreams, we love you.', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `album`
--
ALTER TABLE `album`
  ADD PRIMARY KEY (`id_album`);

--
-- Indices de la tabla `cancion`
--
ALTER TABLE `cancion`
  ADD PRIMARY KEY (`id_cancion`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `album`
--
ALTER TABLE `album`
  MODIFY `id_album` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `cancion`
--
ALTER TABLE `cancion`
  MODIFY `id_cancion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
