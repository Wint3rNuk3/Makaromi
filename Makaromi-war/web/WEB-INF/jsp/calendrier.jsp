<%-- 
    Document   : calendrier
    Created on : 6 déc. 2016, 11:21:55
    Author     : CDI316
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>calendrier</title>
    </head>
    <body>
        <div class="datepicker datepicker-dropdown dropdown-menu" style="display: block; top: 493px; left: 403px;">
            <div class="datepicker-days" style="display: block;">
                <table class=" table-condensed"><thead><tr><th class="prev" style="visibility: visible;">
                                <i class="icon-arrow-left"></i></th><th colspan="5" class="switch">February 2012</th>
                            <th class="next" style="visibility: visible;"><i class="icon-arrow-right"></i></th>
                        </tr>
                        <tr>
                            <th class="dow">Su</th>
                            <th class="dow">Mo</th>
                            <th class="dow">Tu</th>
                            <th class="dow">We</th>
                            <th class="dow">Th</th>
                            <th class="dow">Fr</th>
                            <th class="dow">Sa</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td class="day old">29</td>
                            <td class="day old">30</td>
                            <td class="day old">31</td>
                            <td class="day">1</td>
                            <td class="day">2</td>
                            <td class="day">3</td>
                            <td class="day">4</td>
                        </tr>
                        <tr><td class="day">5</td>
                            <td class="day">6</td>
                            <td class="day">7</td>
                            <td class="day">8</td>
                            <td class="day">9</td>
                            <td class="day">10</td>
                            <td class="day">11</td>
                        </tr>
                        <tr>
                            <td class="day active">12</td>
                            <td class="day">13</td>
                            <td class="day">14</td>
                            <td class="day">15</td>
                            <td class="day">16</td>
                            <td class="day">17</td>
                            <td class="day">18</td>
                        </tr>
                        <tr>
                            <td class="day">19</td>
                            <td class="day">20</td>
                            <td class="day">21</td>
                            <td class="day">22</td>
                            <td class="day">23</td>
                            <td class="day">24</td>
                            <td class="day">25</td>
                        </tr>
                        <tr>
                            <td class="day">26</td>
                            <td class="day">27</td>
                            <td class="day">28</td>
                            <td class="day">29</td>
                            <td class="day new">1</td>
                            <td class="day new">2</td>
                            <td class="day new">3</td>
                        </tr>
                        <tr>
                            <td class="day new">4</td>
                            <td class="day new">5</td>
                            <td class="day new">6</td>
                            <td class="day new">7</td>
                            <td class="day new">8</td>
                            <td class="day new">9</td>
                            <td class="day new">10</td>
                        </tr>
                    </tbody>
                    <tfoot>
                        <tr>
                            <th colspan="7" class="today" style="display: none;">Today</th>
                        </tr>
                    </tfoot>
                </table>
            </div>
            <div class="datepicker-months" style="display: none;">
                <table class="table-condensed">
                    <thead>
                        <tr>
                            <th class="prev" style="visibility: visible;">
                                <i class="icon-arrow-left"></i></th>
                            <th colspan="5" class="switch">2012</th>
                            <th class="next" style="visibility: visible;">
                                <i class="icon-arrow-right"></i></th></tr>
                    </thead><tbody><tr><td colspan="7">
                                <span class="month">Jan</span>
                                <span class="month active">Feb</span>
                                <span class="month">Mar</span>
                                <span class="month">Apr</span>
                                <span class="month">May</span>
                                <span class="month">Jun</span>
                                <span class="month">Jul</span>
                                <span class="month">Aug</span>
                                <span class="month">Sep</span>
                                <span class="month">Oct</span>
                                <span class="month">Nov</span>
                                <span class="month">Dec</span>
                            </td>
                        </tr>
                    </tbody>
                    <tfoot>
                        <tr>
                            <th colspan="7" class="today" style="display: none;">Today</th>
                        </tr></tfoot></table></div><div class="datepicker-years" style="display: none;">
                <table class="table-condensed"><thead><tr><th class="prev" style="visibility: visible;">
                                <i class="icon-arrow-left"></i></th>
                            <th colspan="5" class="switch">2010-2019</th>
                            <th class="next" style="visibility: visible;">
                                <i class="icon-arrow-right"></i></th></tr>
                    </thead><tbody><tr><td colspan="7"><span class="year old">2009</span>
                                <span class="year">2010</span><span class="year">2011</span>
                                <span class="year active">2012</span>
                                <span class="year">2013</span>
                                <span class="year">2014</span>
                                <span class="year">2015</span>
                                <span class="year">2016</span>
                                <span class="year">2017</span>
                                <span class="year">2018</span>
                                <span class="year">2019</span>
                                <span class="year old">2020</span>
                            </td>
                        </tr>
                    </tbody>
                    <tfoot>
                        <tr>
                            <th colspan="7" class="today" style="display: none;">Today</th>
                        </tr>
                    </tfoot>
                </table>
            </div>
        </div>
    </body>
</html>
