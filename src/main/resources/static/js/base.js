$(document).ready(function(){$(".highlight > li:odd").addClass("odd");$(".highlight > li:even").addClass("even");$(".highlight > li").hover(function(){$(this).addClass("hover");},function(){$(this).removeClass("hover");});$("#looked-record").hover(function(){$(this).find("h5").addClass("hover");$(".looked-box").show();},function(){$(this).find("h5").removeClass("hover");$(".looked-box").hide();});$(".looked-box .close").click(function(){$(this).parents().find("h5").removeClass("hover");$(this).parents(".looked-box").hide();});$("#nav").each(function(){var _current=$("#nav").find(".current");var _navitem=$("#nav .nav-item");if(_current.hasClass(".nav-item")){$(".sub-nav-item").hide();$("#"+_current.attr("rel")).show();}else{$(".sub-nav-item").hide();$("#home-nav").show();}_navitem.hover(function(){_navitem.removeClass("hover");_current.removeClass("current");$(this).addClass("hover");$(".sub-nav-item").hide();$("#"+$(this).attr("rel")).show();},function(){var _navself=$(this);var _navmain=$("#"+$(this).attr("rel"));_navmain.hover(function(){},function(){_navself.removeClass("hover");_current.addClass("current");if(_current.hasClass(".nav-item")){$(".sub-nav-item").hide();$("#"+_current.attr("rel")).show();}else{$(".sub-nav-item").hide();$("#home-nav").show();}});});});var h1=$(".l-h").height();var h2=$(".r-h").height();if(h1<h2){$(".l-h").height(h2);}else{$(".r-h").height(h1);}var $back=$("<div class='back-to-top' id='back-to-top'><a class='png-img' href='javascript:void(0);'>Back to Top</a></div>");$back.appendTo("#content");$(window).scroll(function(){if($(window).scrollTop()>100){$(".back-to-top").fadeIn(100);}else{$(".back-to-top").fadeOut(100);}});$(".back-to-top").click(function(){$('body,html').animate({scrollTop:0},100);return false;});});function setTab(name,cursel,n){for(i=1;i<=n;i++){var menu=document.getElementById(name+i);var con=document.getElementById("con_"+name+"_"+i);menu.className=i==cursel?"current":"";con.style.display=i==cursel?"block":"none";}}




$(function () {
    var windowWidth = $(window).width();
    if (windowWidth<600){


    }
    console.log(windowWidth)
})